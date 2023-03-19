#Will try recreating this in java another day
from datetime import date

d0 = date(2023, 2, 19)
d1 = date.today()
delta = d1 - d0
print(delta.days, "days")
