# 🔍 Java Scanner for Interpreter

Welcome to the Java Scanner project! This repository contains a lexical analyzer (scanner) implementation for a simple programming language interpreter. 🚀

## 📋 Table of Contents

- [Features](#features) 
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [Resources](#resources)
- [License](#license)

## ✨ Features

Our scanner supports the following:

- 🔑 Keywords: `if`, `else`, `while`, `print`
- 🆔 Identifiers
- 🔢 Numbers (integers and floats)
- ➕ Operators: `+`, `-`, `*`, `/`, `=`, `(`, `)`
- 📜 String literals
- 💬 Comments (single-line and multi-line)

## 🚀 Getting Started

To get started with this project, follow these steps:

1. Clone the repository:
   ```
   git clone https://github.com/YourUsername/JavaScanner.git
   ```
2. Navigate to the project directory:
   ```
   cd JavaScanner
   ```
3. Compile the Java files:
   ```
   javac *.java
   ```

## 🖥️ Usage

Here's a simple example of how to use the Scanner:

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        String input = "if x = 5 + 3 /* This is a comment */ print \"Hello, world!\" // This is another comment";
        List<Scanner.Token> tokens = scanner.tokenize(input);
        for (Scanner.Token token : tokens) {
            System.out.println(token);
        }
    }
}
```

This will output:

```
Token(KEYWORD, 'if')
Token(IDENTIFIER, 'x')
Token(OPERATOR, '=')
Token(NUMBER, '5')
Token(OPERATOR, '+')
Token(NUMBER, '3')
Token(KEYWORD, 'print')
Token(STRING, '"Hello, world!"')
```

## 🤝 Contributing

Contributions are welcome! Here are some ways you can contribute to this project:

- 🐛 Report bugs
- 💡 Suggest enhancements
- 📝 Improve documentation
- 💻 Submit pull requests

Please read our [Contributing Guidelines](CONTRIBUTING.md) for more information.

## 📚 Resources

If you're new to lexical analysis or want to dive deeper, check out these resources:

- 📖 [Crafting Interpreters](https://craftinginterpreters.com/) - A great book on implementing interpreters
- 🎓 [Stanford CS143 Compilers](https://web.stanford.edu/class/cs143/) - University course on compilers
- 📺 [Computerphile: Lexical Analysis](https://www.youtube.com/watch?v=TG0qRDrUPpA) - Video explanation of lexical analysis

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Happy coding! 💻✨ If you have any questions or feedback, please open an issue or reach out to the maintainers.
