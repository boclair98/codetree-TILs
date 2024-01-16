def calculate_days(month, day):
    total = 0
    for i in range(1, month):
        total += month_days[i]
    total += day
    return total

m1, d1, m2, d2 = map(int, input().split())
word = input()

month_days = [0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
days_of_week = ["Mon", 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']

def get_day_index(day_name):
    return days_of_week.index(day_name)

start_day = get_day_index(word)
diff = abs(calculate_days(m1, d1) - calculate_days(m2, d2))

count = 0
for i in range(diff):
    if days_of_week[(start_day + i) % 7] == word:
        count += 1

print(count)