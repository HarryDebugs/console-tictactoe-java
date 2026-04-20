<div align="center">

# 🎮 Console Tic-Tac-Toe Game ❌⭕

**A progressive Java console application where a Human battles the Computer on a classic 3×3 grid.**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)]()
[![Gitflow](https://img.shields.io/badge/GitFlow-F05032?style=for-the-badge&logo=git&logoColor=white)]()
[![SRM STEP](https://img.shields.io/badge/SRM_STEP-Bootcamp-0052CC?style=for-the-badge)]()
[![Version](https://img.shields.io/badge/Version-5.0-success?style=for-the-badge)]()

*Built by Harry Jay William C as part of an intensive software engineering bootcamp.*

</div>

---

## 📖 About the Project

The **Console Tic-Tac-Toe Game** is a foundational Java application designed to strengthen logical thinking, control flow, and modular programming through the lens of a game everyone knows.

What starts as simply displaying an empty board on the console evolves across **5 developmental stages (Use Cases)** into a fully functional, interactive Human vs Computer Tic-Tac-Toe engine — built using conditional logic, mathematical mapping, defensive programming, and clean method design.

Each Use Case isolates one specific responsibility, teaching **Separation of Concerns** and incremental software development in practice.

---

## 🌟 The Output

When executed, the program renders a clean, readable 3×3 game board on the console:

```
-------------
| - | - | - |
-------------
| - | - | - |
-------------
| - | - | - |
-------------

You won the toss! You go first.
Your symbol    : X
Computer symbol: O

Enter your slot (1-9): 5
Row: 1
Column: 1
true
```

---

## 🛤️ Evolution of the Codebase (UC1 – UC5)

This project was built incrementally, tackling one specific game mechanic at each stage.

| Phase | Branch | Feature Focus | Technical Implementation |
| :--- | :--- | :--- | :--- |
| **🟢 UC1** | `uc1-display-board` | **Board Rendering** | Created a `char[][]` 2D array, initialised all cells with `'-'`, and printed the grid using nested loops with horizontal/vertical separators. |
| **🎲 UC2** | `uc2-toss-assign-symbols` | **Random Toss** | Used `java.util.Random` to simulate a coin flip, applied conditional logic to assign `X` / `O` symbols, and stored game state in static variables. |
| **⌨️ UC3** | `uc3-accept-user-input` | **User Input Handling** | Captured the player's chosen slot (1–9) from the console using `java.util.Scanner`, isolated into its own method following Separation of Concerns. |
| **🔢 UC4** | `uc4-slot-to-board-index` | **Mathematical Mapping** | Converted the 1–9 slot number into zero-based `(row, col)` indices using integer division `(slot-1)/3` and modulo `(slot-1)%3`. |
| **🛡️ UC5** | `uc5-validate-move` | **Defensive Validation** | Implemented boundary checking (row/col within 0–2) and occupancy checking (`board[row][col] == '-'`) to accept or reject a move safely. |

---

## 🧠 Key Concepts Mastered

| Use Case | Concepts |
| :--- | :--- |
| UC1 | 2D Arrays, Initialization Logic, Nested Loops, Console Formatting |
| UC2 | Random Number Generation, Conditional Logic, Game State Variables |
| UC3 | User Input Handling, Method Creation, Separation of Concerns |
| UC4 | Zero-based Indexing, Integer Division, Modulo Arithmetic, Utility Methods |
| UC5 | Conditional Logic, Boundary Checking, Defensive Programming |

---

## 🛠️ Technologies & Concepts Mastered

- **Language:** Java ☕
- **Core Java APIs:** `java.util.Scanner`, `java.util.Random`
- **Data Structures:** 2D Character Array (`char[][]`)
- **Programming Principles:** Separation of Concerns, Defensive Programming, DRY (Don't Repeat Yourself)
- **Game Logic:** Boundary Validation, Mathematical Index Mapping, Symbol Assignment
- **Version Control:** Strict **Gitflow** Branching Strategy (Main ➔ Feature Branches per UC)

---

## 📁 Repository Structure

```
console-tictactoe-java/
│
├── TicTacToe.java       ← Single class containing all 5 UC implementations
└── README.md            ← You are here
```

---

## 💻 How to Run Locally

Want to play it yourself? Follow these steps:

**1. Clone the repository:**
```bash
git clone https://github.com/YOUR_USERNAME/console-tictactoe-java.git
cd console-tictactoe-java
```

**2. Compile the Java file:**
```bash
javac TicTacToe.java
```

**3. Run the program:**
```bash
java TicTacToe
```

> ✅ No external dependencies. Plain Java — runs anywhere with JDK 8+.

---

## 🌿 Gitflow Branch Strategy

```
main
 └── uc1-display-board
 └── uc2-toss-assign-symbols
 └── uc3-accept-user-input
 └── uc4-slot-to-board-index
 └── uc5-validate-move
```

Each branch represents one completed Use Case. Branches build upon each other sequentially, and the final `uc5-validate-move` branch is merged back into `main` as the complete working game foundation.

---

## 📐 Slot-to-Board Mapping Reference

```
Slot Numbers (user view)       Board Indices (system view)
┌───┬───┬───┐                  ┌──────────┬──────────┬──────────┐
│ 1 │ 2 │ 3 │                  │ [0][0]   │ [0][1]   │ [0][2]   │
├───┼───┼───┤       ──▶        ├──────────┼──────────┼──────────┤
│ 4 │ 5 │ 6 │                  │ [1][0]   │ [1][1]   │ [1][2]   │
├───┼───┼───┤                  ├──────────┼──────────┼──────────┤
│ 7 │ 8 │ 9 │                  │ [2][0]   │ [2][1]   │ [2][2]   │
└───┴───┴───┘                  └──────────┴──────────┴──────────┘

Formula:  row = (slot - 1) / 3
          col = (slot - 1) % 3
```

---

## 🚀 What's Next (Beyond UC5)

These Use Cases lay the groundwork for a fully playable game. Future extensions could include:

- ✅ **UC6** — Computer AI move (random or strategic)
- ✅ **UC7** — Check for Win / Draw condition
- ✅ **UC8** — Full game loop with replay option

---

<div align="center">

*Made with ☕ Java and 💡 logic - one Use Case at a time.*

</div>
