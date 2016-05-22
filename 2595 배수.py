def small(N):
    i = 1
    while(True):
        if(N>=10):
            temp = N
            a=temp/10
            temp=temp-a
            b=temp
            if(a==b):
                return a*10+b
        elif(N>=100):
            temp = N
            a = temp/100
            temp = temp - a
            b = temp/10
            temp = temp - b
            c = temp
            if(a == b or b == c or c == a):
                return N
        elif (N>=1000):
            return 0
        elif (N>=10000):
            return 0
        i += 1
        N = N*i
        
    
N = int(input('N='))
print(small(N))
