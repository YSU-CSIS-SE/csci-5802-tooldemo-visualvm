Initial draft. [TODO](/TODO.md)

![VisualVM logo](/visualvm_logo_big.png)

# Description
[VisualVM](https://visualvm.github.io/) is a Java profiling tool. It integrates the functionality of JDK commandline tools with 
its profiler in an easy-to-use gui. It ships as part of the JDK or standalone and is very widely used in java development and production.

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

# Use cases
 * Identify CPU bottlenecks for optimization
   - CPU sampler or profiler views, thread CPU usage views
   - Impliment different implimentations and swap between them at runtime: compare performance using snapshots
 * Find memory leaks
   - Memory Sampler and profiler
   - Find largest objects or sort by instances or bytes (with filters to only view objects from your program)
 * Visualize threads to identify deadlocks
   - Thread view to identify a deadlock situation, thread dump to see problematic methods, heap dump to analize program state
 * View core dumps to debug faulty logic
   -  View stack trace to identify where the problem occured
 * Debug launcher code
   - Use Overview to check the VM arguments and environment

# Tool Evaluation
 - User friendliness
   - Nice tabs
     - Highly configurable but very easy to mess up
   - Information displays look good
 - Stability
   - UI freeze occured during testing
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
