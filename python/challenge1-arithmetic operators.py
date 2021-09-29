# Percentage of expenditure in relation to salary
salary: float
expenditure: float

salary = 3450.45
expenditure = 2456.2

print(f"salary = {salary}")
print(f"expenditure = {expenditure:.2f}")

percentage = (100 * expenditure) / salary

print(f"percentage = {percentage:.2f}",end='')

print(f"\npercentage = {(100 * expenditure) / salary:.2f}")