Compiler Extension Proposal

You group should submit a document that details the extensions you plan to make to the base language compiler through the rest of the semester. You should propose 3 minor extensions and 2 major extensions where one of the major extension will be a stretch goal. Minor extension are those that require smaller amounts of effort. For example adding division or adding for-loops would be a minor extension. Major extensions require larger amounts of effort. For example, adding type inference, adding an object system, or adding first-class functions would be major extensions. Clearly the division between major and minor is not well defined; use your judgement and I will give corrective feedback as necessary. Other extension could be adding things like pattern matching (major), optimizations (minor or major depending on what is proposed), support for threading (major). Consult your text book(s) and other languages for inspiration.

For each extension you should write a proposal that approximates "real" language extension proposals. 
For example:
Java - https://openjdk.java.net/jeps/0
Rust - https://github.com/rust-lang/rfcs
Swift - https://github.com/apple/swift-evolution

At a minimum your proposal for each extension must provide:

1) A justification of the extension. Who would benefit from the feature? Why should it be added?

2) A description of the extension from the view point of a compiler user. How will it work? What will the syntax look like (code examples)? For minor extensions this may be brief; major extensions will require more text. 

3) A description of the impacts of the extension on the compiler. What parts of the pipeline will be impacted? How significant will the impacts be? How will it interact with the other extensions you are proposing?

4) A description of how you will judge the success of the extension.

Finally, you should propose a timeline for implementing the proposed extensions.


---

# Minor Proposal:

shift operator (>> and <<)

## Abstract
* Implement bitwise left and right shift operator << and >> in the blc language.

## Rationale/Justification
* The developer and user can benefit from the shift operator and the optimized performence.
* The bitwise shift operators is a important operation due to it's speed. For example, we can use the shift operator in our optimizer to optimize the modulus/remainder operator and the division (see the next proposal).
* The shift operators is also commonly used in Cryptography. For example, the AES (Advanced Encyption Standard) uses the ShiftRows step.

## Syntax/How it work
```
2 << 3 // 16
2 >> 3 // 0
5 << 4 // 80
128 >> 3 // 16
```
* The shift operator will operate in a similar way compare the the shift operator in Python and C.
* It will be a BinaryOperation.
* ...

## Impacts/Proposed Changes
* 

## Outcome/how to judge success
* 
* shift works?






