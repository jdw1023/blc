Compiler Extension Proposal

Your group should submit a document that details the extensions you plan
to make to the base language compiler through the rest of the semester.
You should propose 3 minor extensions and 2 major extensions where one
of the major extensions will be a stretch goal. Minor extensions are
those that require smaller amounts of effort. For example adding
division or adding for-loops would be a minor extension. Major
extensions require larger amounts of effort. For example, adding type
inference, adding an object system, or adding first-class functions
would be major extensions. Clearly the division between major and minor
is not well defined; use your judgment and I will give corrective
feedback as necessary. Other extensions could be adding things like
pattern matching (major), optimizations (minor or major depending on
what is proposed), support for threading (major). Consult your
textbook(s) and other languages for inspiration.

For each extension you should write a proposal that approximates
"real" language extension proposals.

For example:

Java -
[[https://openjdk.java.net/jeps/0]{.underline}](https://openjdk.java.net/jeps/0)

Rust -
[[https://github.com/rust-lang/rfcs]{.underline}](https://github.com/rust-lang/rfcs)

Swift -
[[https://github.com/apple/swift-evolution]{.underline}](https://github.com/apple/swift-evolution)

At a minimum your proposal for each extension must provide:

1) A justification of the extension. Who would benefit from the
feature? Why should it be added?

2) A description of the extension from the viewpoint of a compiler
user. How will it work? What will the syntax look like (code examples)?
For minor extensions this may be brief; major extensions will require
more text.

3) A description of the impacts of the extension on the compiler. What
parts of the pipeline will be impacted? How significant will the impacts
be? How will it interact with the other extensions you are proposing?

4) A description of how you will judge the success of the extension.

Finally, you should propose a timeline for implementing the proposed
extensions.

Major Proposals:

# Major Proposal 1 type inferences (?)

## Abstract

-   The compiler will have the ability to infer the type of an
    expression at compile time

## Rationale/Justification

-   Makes writing code much easier for the developer.

-   Allows code to be more concise while still having type check.

-   

## Syntax/How it work

```kotlin

var number = 3 // infer to be a Int

var string = "Hello" // infer to be a String

fun add(x: Int, y: Int){

    return x+y

}

add(x,y)

```

-   It will be inferred that since number = 3 it must be an int

-   The function add requires two ints so it is inferred that x and y
    are ints

## Impacts/Proposed Changes

-   -   Semantic analysis for types using clues from declarations

    -   

## Outcome/how to judge success

The developer will be able to declare variables without specifying the
types and the compiler will be able to recognize what type it is.

# Major Proposal 2 alternate code generation (x86 or x86-64 assembly)

## Abstract

-   This proposal proposes a new (alternative) code generation for the
    BLC language. This new code generation is not a replacement for the
    already existing bytecode generation in our BLC compiler. The
    alternative code generation will be generating a x86 assembly code
    that is compatible with the NASM (TBD, but probably NASM or GAS)
    assembler.

## Rationale/Justification

-   x86/x86-64 is one of the most popular computer architectures used on
    desktop. It would be nice for the blc to be able to generate
    x86/x86-64 assembly code.
-   NASM being the most popular assembler on linux for x86/x86-64 is a
    logical choice for our compiler to target.

## How it work

-   We can add the x86 assembly support to the code generation. Using
    the MachineCode and MachineCodeGeneration class.
-   The MachineCode and MachineCodeGeneration can be used to write to
    the assembly file.
-   The visitor class will be used to visit each node in the AST. Then
    converting each part into assembly.

## Impacts/Proposed Changes

-   -   The proposed changes will be on the code generation.

## Outcome/how to judge success

-   The outcome of this proposal is that our compiler should be able to
    generate x86 assembly code that can then be assembled using the nasm
    assembler.
-   We think that this is a success if most of our test cases can be
    compiled into working x86 nasm assembly code.

[]{#anchor-13}Minor Proposals:

# Minor Proposal 1 shift operator (>> and <<):

## Abstract

-   Implement bitwise left and right shift operator << and >> in the
    blc language (arithmetic shift).

## Rationale/Justification

-   The developer and user can benefit from the bitwise shift operator
    and the optimized performance.
-   The bitwise shift operator is an important operation due to its
    speed. For example, we can use the shift operator in our optimizer
    to optimize the modulus/remainder operator and the division (see the
    next proposal).
-   The shift operator is also commonly used in Cryptography. For
    example, the AES (Advanced Encryption Standard) uses the ShiftRows
    step.

## Syntax/How it work

```kotlin

var x: Int = 2 << 3

If ( 2 >> 3 == 0){

print("2>>3 == 0")

}

print(5 << x)

print(128 >> 3)

```

-   The shift operator will operate in a similar way compared to the
    shift operator in Python and C.
-   It will be a BinaryOperation and use the BinaryExpressionNode.
-   X << Y will return X with the bits shifted to the left by y
    places.

## Impacts/Proposed Changes

-   We will need to change multiple part of the compiler

    -   Some small changes in the parser to add >> and <<

    -   For semantic analysis

    -   Some changes in the code generation to support the generation of
        > java bytecode lshr and lshl.
        > [*https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.10.1.9.lshl*](https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.10.1.9.lshl)

## Outcome/how to judge success

-   Users will be able to create programs with the shift operator
-   shift works correctly, shift work as arithmetic shift for signed
    values.

# Minor proposal 2 xor operator (^) 

## Abstract

-   Implement the xor operator in the blc language

## Rational/Justification 

-   The xor operator is a very important logical operator.

-   Used in cryptography, especially in the creation of cyphers

## Syntax/How it works

```kotlin

var x: int = 5

var y: int = 6

print(x^y) // 3

var t: bool = true

var f: bool = false

If (t^f){

print(true)

}

```

-   The xor will return true if the two bits or not the same and false
    if they are the same
-   It is a BinaryOperation

## Impacts/Proposed changes 

-   The parser will need to recognize ^
-   Semantic analysis will have to make sure that the types are the
    same.

## Outcome/how to judge success 

-   Users will be able to use xor in programs
-   Xor works correctly
-   Test cases for xor

# Minor Proposal 3 division operator ( / ):

## Abstract

-   Implement the division operator in the blc language.

## Rationale/Justification

-   Division is one of the fundamental mathematical operators.
-   The developer and user can benefit from the ability to use division
    in their code/program.
-   The division operator is an important operation. Many mathematical
    operations such as taking average, breaking a number into equal
    parts uses division.

## Syntax/How it work

```kotlin

var x: Int = 2 / 3

If ( 2 / 3 == 0){

print("2 / 3 == 0")

}

print(100 / 5) // 20

print(20 / 8) // 2

```

-   The division operator will operate in a similar way compared to the
    division operator in C.
-   Since blc right now only supports Int Literal we take the floor
    division.
-   It will be a BinaryOperation and use the BinaryExpressionNode.
-   X / Y will return X floor division by Y.

## Impacts/Proposed Changes

-   We will need to change multiple part of the compiler

    -   Some small changes in the parser to add / and //

    -   For semantic analysis

    -   Some changes in the code generation to support the generation of java bytecode fdiv and ddiv. [*https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.10.1.9.ddiv*](https://docs.oracle.com/javase/specs/jvms/se17/html/jvms-4.html#jvms-4.10.1.9.ddiv)

## Outcome/how to judge success

-   Users will be able to create programs with the division operator
-   Division works correctly
-   Test cases for division.

