Initial draft. [TODO](/TODO.md)

# Description
[VisualVM](https://visualvm.github.io/) is a Java profiling tool

# Setup
VisualVM is provided standalone or integrated into an IDE
## Standalone
### Windows
Download from official site, extract to any directory and run bin/visualvm.exe
### *nix
Download from official site, extract to any directory and run the bin/visualvm shell script
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
 * Find memory leaks
 * Visualize threads to identify deadlocks
 * View core dumps to debug faulty logic

# Tool Evaluation
 - User friendliness
   - Nice tabs
     - Highly configurable but very easy to mess up
   - Information displays look good
 - Stability
   - UI freeze
 - Integratibility/Flexibility
   - IDE plugins
     - Netbeans
     - Eclipse
     - IntelliJ IDEA
   - OQL support
   - Variety of export formats
