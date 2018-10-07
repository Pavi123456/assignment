import math

i,r =input().split()
i=int(i)
r=int(r)
print(type(i))
count=0
for q in range(i,r):
  if int(math.sqrt(q))**2==q:
      count=count+1
print(count) 