package stacksAndQueues.queue;

class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currPetrol = 0;

        int start =0;   // assuming that we will start from 0 index

        int n = gas.length;

        int index;

        for(index=start;index<n;){

            currPetrol += gas[index] - cost[index];

            index++;

            if(currPetrol <0){

                for(;index<n;index++){

                    if(gas[index]>=cost[index]){

                        currPetrol =0;

                        start =index;

                        break;

                    }
                }
            }
        }

        if(currPetrol < 0){

            return -1;

        }

        for(index=0;index<start;index++){

            currPetrol += gas[index] - cost[index];

            if(currPetrol<0){

                return -1;

            }
        }

        return start;

    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {

        int currPetrol = 0;

        int total=0;

        int n = gas.length;

        int start=0;

        for(int index=0;index<n;index++){

            currPetrol += gas[index] - cost[index];

            if (currPetrol <0){

                start = index+1;

                total += currPetrol;

                currPetrol=0;

            }
        }

        return (currPetrol+total>=0) ? start : -1;
    }
}



public class circularTour_GasStation {
    public static void main(String[] args) {

        // best 2 method
        // tech dose video for it

        int ans = new GasStation().canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2});

        System.out.println("ans " + ans);

    }
}
