/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        //extract all start times into one array, all end times into another
        //sort both arrays independently
        //walk through with two points, one for starts and one for ends
        //track current rooms in use and maximum seen so far:
        //  if next start is before current end, a new meeting begins - increment count
        //  else a meeting ends - decrement count, advance the end pointer
        //return the maximum count reached

        int n = intervals.size();
        if(n == 0){
            return n;
        }

        //Step 1: Pull out all start and end times into separate arrays and sort them independently
        int []starts = new int[n];
        int []ends = new int[n];
        for(int i = 0; i < n; i++){
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        int roomsInUse = 0;
        int maxRooms = 0;
        int startPtr = 0;
        int endPtr = 0;

        //Step 2: Walk through every start event and free up any rooms whose meetings have ended by this start time
        while(startPtr < n){
            if(starts[startPtr] < ends[endPtr]){
                //this means a new meeting begins before the earliest ongoing ends - needs a new meeting room now
                roomsInUse++;
                startPtr++;
                maxRooms = Math.max(maxRooms, roomsInUse);
            } else {
                //this means the earliest ongoing meeting has ended at this point - free that room before considering next start
                roomsInUse--;
                endPtr++;
            }
        }

        return maxRooms;
    }
}
