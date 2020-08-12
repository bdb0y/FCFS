package com.dev.amin;

public interface FCFS {

    void resolveTimeDelay(int numberOfProcesses,
                          int[] processes, int[] burstTime, int[] timeDelay);

    void resolvePivotTime(int numberOfProcesses,
                          int[] processes, int[] burstTime, int[] timeDelay,
                          int[] pivotTime);

    void resolveAverageTime(int numberOfProcesses, int[] processes,
                            int[] bt);
}
