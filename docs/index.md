![VisualVM logo](/images/visualvm_logo_big.png)

# Description
[VisualVM](https://visualvm.github.io/) is a Java profiling tool. It integrates the functionality of JDK commandline tools with 
its profiler in an easy-to-use gui. It ships as part of the JDK or standalone and is very widely used in java development and production.

While VisualVM *can* help find errors like deadlocks, memory leaks, and others, it is no substitute for a real debugger. 
Its main use should be to track down a program's largest inefficiencies to help optimize a program.

[Video Feature Demo](https://www.youtube.com/watch?v=SQsCgmWmVzg)

# Setup
VisualVM is provided standalone or integrated into an IDE
## Standalone
### Windows
Download from official site, extract to any directory and run bin/visualvm.exe
### *nix
Download from official site, extract to any directory and run the bin/visualvm shell script
### Mac
Download and install the .dmg file from the official site
## Integrated
### Netbeans
VisualVM's profiling engine is tightly integrated into Netbeans already as the __NetBeans profiler__
### Eclipse
Download the plugin from [the official site](https://visualvm.github.io/idesupport.html) and 
follow the directions there to install and use it.
### IntelliJ IDEA
Install the 3rd party plugin [VisualVM Launcher](https://plugins.jetbrains.com/plugin/7115-visualvm-launcher) manually or 
from within IntelliJ IDEA and use the added toolbar buttons to launch VisualVM along with the application.

# [Use cases](/usecases.md)
 * [Identify CPU bottlenecks for optimization](/usecases.md#identify-bottlenecks)
   - CPU sampler or profiler views, thread CPU usage views
 * [Compare method implimentations](/usecases.md#compare-method-implimentations)
   - Impliment methods multiple ways and swap between them at
     runtime to compare performance
 * [Locate memory leaks](/usecases.md#locate-memory-leaks)
   - Memory sampler and profiler
   - Find largest objects or sort by instances or bytes (with filters to only view objects from your program)
 * [Debug launcher code](/usecases.md#debug-launcher-code)
   - Use Overview to check the VM arguments and environment

# Tool Evaluation
 - User friendliness
   - Customizable UI
     - Highly configurable but also very easy to mess up
       (e.g. accidentally dragging a view)
   - Information displays are intuitive
   - Icons are informative
   - Searching and filtering is available for lists
 - Stability
   - UI freeze occured during testing
   - Instrumentaion can fail with obscure errors for some programs
 - Integratibility/Flexibility
   - Integrates with any XMP-compatable program
   - IDE plugins
     - Netbeans
     - Eclipse
     - IntelliJ IDEA
   - OQL (Object Query Language) support for searching heap dumps
   - Variety of export formats
   - Built in plugin manager with support for official and 3rd party plugins
   - Open source!
