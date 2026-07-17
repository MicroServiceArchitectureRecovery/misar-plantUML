# MiSAR Graphical Model Generator

[![Java](https://img.shields.io/badge/Java-OpenJDK%2021-ED8B00?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Documentation](https://img.shields.io/badge/documentation-MiSAR-2563eb?logo=readthedocs&logoColor=white)](https://microservicearchitecturerecovery.github.io/MiSAR-Parser-and-Model-Transformation/)
[![Latest Release](https://img.shields.io/github/v/release/MicroServiceArchitectureRecovery/misar-plantUML?display_name=tag&sort=semver&label=Latest%20Release)](https://github.com/MicroServiceArchitectureRecovery/misar-plantUML/releases/latest)


The **MiSAR Graphical Model Generator (GMG)** is the visualisation and reporting component of MiSAR. It accepts a MiSAR **Platform Independent Model (PIM)** and generates outputs that support architectural inspection, analysis, and reporting.

The GMG can produce architecture views, dependency views, UML-style diagrams, scalable SVG outputs, and Excel summaries containing recovered architecture metrics and component information.

> For normal users, the GMG is installed and updated automatically through the **[MiSAR All-in-One launcher](https://github.com/MicroServiceArchitectureRecovery/MiSAR-Parser-and-Model-Transformation)**. Manual repository use is primarily relevant to maintainers and contributors.

## Requirements

The MiSAR Graphical Model Generator requires:

- **Java Runtime Environment 21 or later**
- **OpenJDK 21** is the tested and recommended runtime

For normal users, the Graphical Model Generator is installed and updated automatically through the MiSAR AIO.

For current usage and troubleshooting guidance, use the [MiSAR documentation](https://microservicearchitecturerecovery.github.io/MiSAR-Parser-and-Model-Transformation/).

## Repository Role

```mermaid
flowchart LR
    PIM[/Input:<br/>MiSAR Platform Independent Model<br/>PIM/]
    GMG[Tool:<br/>MiSAR Graphical Model Generator]
    ARCH([Output:<br/>Architecture views])
    DEP([Output:<br/>Dependency views])
    XLS([Output:<br/>Excel summaries])
    FORMATS{{Formats:<br/>PNG, SVG and<br/>PlantUML source}}

    PIM --> GMG
    GMG --> ARCH
    GMG --> DEP
    GMG --> XLS
    ARCH -.-> FORMATS
    DEP -.-> FORMATS
```
## Related repositories

- **[MiSAR project overview](https://github.com/MicroServiceArchitectureRecovery/misar)**
- **[MiSAR Parser, Transformation Engine and AIO](https://github.com/MicroServiceArchitectureRecovery/MiSAR-Parser-and-Model-Transformation)**

## Documentation

Use the maintained guide for the current workflow and output descriptions:

- **[MiSAR documentation](https://microservicearchitecturerecovery.github.io/MiSAR-Parser-and-Model-Transformation/)**
- **[Create a PIM](https://microservicearchitecturerecovery.github.io/MiSAR-Parser-and-Model-Transformation/create-pim/)**
- **[Graphical Model Generator guide](https://microservicearchitecturerecovery.github.io/MiSAR-Parser-and-Model-Transformation/graphical-generator/)**

## Copyright

© 2020-2026 Dr Nour Ali, Brunel University London. All rights reserved. MiSAR is made openly available for research and evaluation purposes. The intellectual property and copyright of this tool and its associated research remain with Dr Nour Ali and Brunel University London.