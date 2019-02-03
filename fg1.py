
total = 0.0
s = '1.23, 2.4, 3.123'
l = s.split(', ')

for i in range(0, len(l)):
	total += float(l[i])
print (total)	
