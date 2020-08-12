package com.dev.amin;

public class FCFSImplementation implements FCFS {

    @Override
    public void resolveTimeDelay(int numberOfProcesses, int[] processes, int[] burstTime,
                                  int[] timeDelay) {
        timeDelay[0] = 0;

        for (int i = 1; i < numberOfProcesses; i++)
            timeDelay[i] = burstTime[i - 1] + timeDelay[i - 1];
    }

    @Override
    public void resolvePivotTime(int numberOfProcesses, int[] processes, int[] burstTime, int[] timeDelay, int[] pivotTime) {

        for (int i = 0; i < numberOfProcesses; i++)
            pivotTime[i] = burstTime[i] + timeDelay[i];
    }

    @Override
    public void resolveAverageTime(int numberOfProcesses,
                                   int[] processes, int[] burstTime) {

        int[] pivotTime = new int[numberOfProcesses];
        int[] timeDelay = new int[numberOfProcesses];
        int totalTimeDelay = 0,
                totalPivotTime = 0;

        resolveTimeDelay(numberOfProcesses, processes,
                burstTime, timeDelay);

        resolvePivotTime(numberOfProcesses, processes, burstTime,
                timeDelay, pivotTime);

        System.out.print("Processes Burst time | Delay"
                + " time | Pivot time\n");

        for (int i = 0; i < numberOfProcesses; i++) {
            totalTimeDelay = totalTimeDelay + timeDelay[i];
            totalPivotTime = totalPivotTime + pivotTime[i];
            System.out.printf(" %d ", (i + 1));
            System.out.printf("     %d ", burstTime[i]);
            System.out.printf("     %d", timeDelay[i]);
            System.out.printf("     %d\n", pivotTime[i]);
        }
        float averageTimeDelay = (float) totalTimeDelay /
                (float) numberOfProcesses;
        int averagePivotTime = totalPivotTime / numberOfProcesses;
        System.out.printf("Average delay time = %f", averageTimeDelay);
        System.out.print("\n");
        System.out.printf("Average pivot time = %d \n\n",
                averagePivotTime);
    }
}