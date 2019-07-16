import datetime
start = datetime.datetime.now()
count = 1  #统计质数个数
total = 0  #统计计算次数
#print(2)
for i in range(3, 9000000, 2):
    for j in range(3, int(i**0.5)+1, 2):
        total += 1
        if i % j == 0:
            break
    else:
        #print(i)
       count += 1
detal = (datetime.datetime.now()-start).total_seconds()
print("The number of prime is :", count)
print("The total traversal is :", total)
print("The time is :", detal)

#1000000
#The number of prime is : 78498
#The total traversal is : 33600560
#The time is : 13.884794
#[Finished in 14.5s]

#9000000
#The number of prime is : 602489
#The total traversal is : 749638660
#The time is : 388.727234
#[Finished in 389.6s]
