The following tests were performed on 
[a simple example program](PrimeGen.java) 
that generates prime numbers

# Use Cases
  - [Identify Bottlenecks](#identify-bottlenecks)
  - [Compare Method Implimentations](#compare-method-implimentations)

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

