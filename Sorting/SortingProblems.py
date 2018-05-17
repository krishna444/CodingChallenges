def maxProductOfThree(A):
    A.sort()
    print(A)
    length=len(A)
    return max(A[0]*A[1]*A[length-1],A[length-1]*A[length-2]*A[length-3])

def triangle(A):
    if(len(A)<3):
        return 0
    
    A.sort()
    for x in range(2,len(A)):
        if (A[x-2]+A[x-1]) >0:
            return 1
    return 0



A=[-3,1,2,-2,5,6]
print(maxProductOfThree(A))

print(triangle(A))

