# 💰 Tip Calculator App

A simple and elegant **Tip Calculator** built using **Jetpack Compose** in Android Studio. This app allows users to input a bill amount and calculates a 15% tip instantly.

## ✨ Features

- Input the bill amount.
- Automatic 15% tip calculation.
- Input field supports only numeric values.
- Clean, scrollable UI with padding for safe areas.
- Responsive design preview enabled with system UI.

## 🛠 Tech Stack

- **Language:** Kotlin
- **Framework:** Jetpack Compose
- **UI Toolkit:** Material3
- **Tools:** Android Studio, Compose Preview

## 📱 Screenshots

> _Add your screenshots here if needed_

## 🧠 Code Structure

- `MainActivity.kt`: Main entry point that sets the content view.
- `TipTimeLayout()`: Main composable displaying input and result.
- `EditNumberField()`: TextField for numeric input with keyboard type set to `Number`.
- `calculateTip()`: Business logic for calculating the tip using `NumberFormat`.

## 📦 How to Run

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/tip-calculator.git
