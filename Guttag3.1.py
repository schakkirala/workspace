i = int(raw_input('Enter an int: ')) 

root = 2
for pwr in range(0,abs(6)+1): 
	print root, ' ', pwr
	if (root**pwr == abs(i)):
		print root, '::: ', pwr
