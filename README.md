# Stitch Lab Tools

**Frankenstein Ultra** + **Victor** — built by [Steven Edds](mailto:sedds89@gmail.com) / [Stitch Lab](https://stitchlab.dev).

This repo is **shareable bones + official APKs**. It is **not** open source product source.

| Ships here | Does not ship |
|------------|----------------|
| Working **Victor** APK (with its binaries) | Frankenstein / Victor product source |
| Working **Frankenstein Ultra** APK (not Driver) | Driver source |
| Bare-bones Gradle sketches to explore the shape | Training, datasets, model integrations |
| | Workspace setups, debug dumps, cloud/SaaS internals |

Official apps are the APKs. Bones exist so curious builders can **try** and hit the same hard problems (companion runtime, AIDL, packaging). We are not solving those for you here.

Want full source to contribute, or a commercial / custom deal? Email **sedds89@gmail.com**.

## Install (use these)

1. Install [`releases/companion-runtime.apk`](releases/companion-runtime.apk) (**Victor**) first  
2. Install [`releases/frankenstein-ultra.apk`](releases/frankenstein-ultra.apk)  
3. Open Ultra  

Downloads also: https://stitchlab.dev/downloads.html

## Bones layout

```text
frankenstein/     Host sketch only — no Driver source
runtime_pack/     Companion sketch — no native toolchains in-tree
releases/         Official prebuilt APKs
```

Build the bones if you want the learning curve. Expect incomplete pieces. That is intentional.

## License

Personal use of official APKs. No fork, no rebuild-as-product, no resale. See [`LICENSE`](LICENSE).

This repository is a public architectural/reference edition of Frankenstein. It is intentionally not the production source tree. The downloadable builds demonstrate the complete system; selected source is published to document authorship, architecture and integration patterns without disclosing proprietary implementation.
