class BudgetTracker:
    def __init__(self):
        self.balance = 0
        self.transactions = []

    def add_income(self, amount):
        self.balance += amount
        self.transactions.append(f"Income: +{amount}")
        print(f"Added income: {amount}")

    def add_expense(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            self.transactions.append(f"Expense: -{amount}")
            print(f"Added expense: {amount}")
        else:
            print("Insufficient balance for this expense.")

    def show_balance(self):
        print(f"Current balance: {self.balance}")

    def show_transactions(self):
        if not self.transactions:
            print("No transactions recorded.")
        else:
            print("Transactions:")
            for t in self.transactions:
                print(t)


def main():
    tracker = BudgetTracker()

    while True:
        print("\nCommands: income, expense, balance, transactions, exit")
        command = input("Enter command: ")

        if command == "income":
            amount = float(input("Enter income amount: "))
            tracker.add_income(amount)
        elif command == "expense":
            amount = float(input("Enter expense amount: "))
            tracker.add_expense(amount)
        elif command == "balance":
            tracker.show_balance()
        elif command == "transactions":
            tracker.show_transactions()
        elif command == "exit":
            print("Exiting program.")
            break
        else:
            print("Invalid command.")


if __name__ == "__main__":
    main()
