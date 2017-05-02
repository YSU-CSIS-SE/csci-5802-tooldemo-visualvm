The following tests were performed on 
[a simple example program](PrimeGen.java) 
that generates prime numbers. In order for profiling to work, 
it needed to be run with -Xverify:no

# Use Cases
  - [Identify Bottlenecks](#identify-bottlenecks)
  - [Compare Method Implimentations](#compare-method-implimentations)
  - [Locate memory leaks](#locate-memory-leaks)

## Identify Bottlenecks
  1. To identify where your program is spending most of its time, open the 
CPU sampler or profiler view. We will be using the CPU profiler in this 
example, but the sampler could be used similarly.  
![screenshot](/images/CPUprofiler.png)

  2. Hit the CPU profiling button. This will perform first time 
profiler setup, if this is your first time using the profiler, 
and then instrument your methods with profiling code.  
![screenshot](/images/instrumenting.png)
![screenshot](/images/instrumented.png)

  3. Once it has completed, perform the task you wish to profile in the 
profiled application, if applicable. You will see the results 
immediately. For our example program, we ran through its main loop 5 
times to collect data. Raw CPU time as well as CPU time as a percentage 
of the program's total CPU time will be visible, and the percentages will 
also be rendered graphically for easy assesment.  
![screenshot](/images/profiling.png)

  4. Use the filter to focus in on your own classes and methods, if 
needed.  
![screenshot](/images/filter.png)

## Compare Method Implimentations
  1. First, add code to your application to allow it to switch between 
method implimentations at run time. See our example code for how we set 
up a small test.  

  2. Next, open your program in VisualVM and switch to the CPU 
profiler/sampler view.  
![screenshot](/images/CPUprofiler.png)

  3. Collect profiling data for both methods. Ensure both methods are put 
through the same test to keep results comprable, and be sure to run your 
tests an appropriate number of times.  
![screenshot](/images/profiling.png)

  4. Filter the profiling results down to the chosen methods to see 
relative performance. Use this to select the most effecient method 
implimentation.  
![screenshot](/images/filter.png)

## Locate Memory Leaks
  1. Open your program in VisualVM and go to the memory profiler view.  
![screenshot](/images/memProfiler.png)

  2. Edit the memory settings by selecting the `Settings` checkbox and 
switching the the memory settings tab. Select settings depending on how 
much data you would like to collect. More data collection comes at the 
cost of worse performance. For our purposes in this example, we will 
track all object allocations and record stack traces of each one, 
so we can find the culprit.  
![screenshot](/images/memSettings.png)

  3. When the memory profiling settings are to your liking, hit the 
memory button to begin the instrumentation process. After instrumentation 
completes, a live feed of all tracked objects, by type, will be 
displayed.  
![screenshot](/images/memProfiling.png)

  4. Take a snapshot before attempting to reproduce the memory leak.  
![screenshot](/images/memSnapshot.png)

  5. Run your application attempting to reproduce the memory leak until 
you see strange behavior on the profiler or monitor view.  
![screenshot](/images/memMonitor.png)

  6. Take another snapshot once you think the memory leak has occured to 
the extent that the leaked objects will be easily identifiable.  
![screenshot](/images/memSnapshot2.png)

  7. Go to the original snapshot and use the rightmost button above the 
object list to generate a comparison view against the new snapshot.  
![screenshot](/images/memCompareSelect.png)
![screenshot](/images/memCompare.png)

  8. Try to locate a culprit object. If you did not use the setting to 
record allocation stack traces, use knowledge of the object name and 
where it might be used to attempt to locate the leak in the source.  

  9. If you selected the setting to record application stack traces, go 
to the most recent snapshot from the comparison and find the object on 
the list using the search feature.  
![screenshot](/images/memFind.png)

  10. Right click on the object and select `Show Allocations Stack 
Traces`. This will show what methods are allocating the object, and how 
much of the object they have allocated. You can use this information to 
locate the leak very quickly, or possibly identify that the object is not 
really the source of the memory leak, allowing you to look for a 
different candidate immediately.  
![screenshot](/images/allocationTrace.png)

## Debug Launcher Code
  1. If you have a Java program which is started by a launcher, you can 
use VisualVM to quickly verify the launch paramaters. Simply open the 
program in VisualVM and, on the overview window, inspect the JVM 
arguments and system properties tabs.  
![screenshot](/images/launcherDebug.png)
