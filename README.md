# 📱 Tip Calculator App

A simple Android app built using **Jetpack Compose** that calculates the tip based on the bill amount and service percentage. The user can optionally choose to round up the tip.

---

## 🛠 Features

- Input the **bill amount** and **tip percentage**
- Toggle to **round up** the tip
- Live calculation and formatted currency display
- Clean and modern UI using **Material 3**
- Icon-enhanced input fields with `leadingIcon`

---

## 🧰 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Material 3**
- **Android Studio Koala Feature Drop**
- **Composable functions**
- **State management** using `remember` and `mutableStateOf`

---

## 🚀 How to Run

1. **Clone the repository**
    ```bash
    git clone https://github.com/your-username/tip-calculator-compose.git
    cd tip-calculator-compose
    ```

2. **Open the project in Android Studio**

3. Make sure your **emulator** or **physical device** is connected

4. **Run the app**
    - Click the ▶️ `Run` button in Android Studio
    - Or use the terminal:
        ```bash
        ./gradlew installDebug
        ```

---

## 📁 File Structure

com.example.tipcalculator/
├── MainActivity.kt
├── ui.theme/ # Contains your custom theme
├── res/
│ ├── drawable/ # money.png, percent.png
│ ├── values/ # strings.xml, themes.xml

yaml
Copy
Edit

---

## 🔧 TODOs / Enhancements

- [ ] Add dark mode support
- [ ] Support for multiple currencies
- [ ] Add unit tests
- [ ] Improve UX for edge-case inputs

---

## 📄 License

This project is licensed under the [MIT License](LICENSE)
