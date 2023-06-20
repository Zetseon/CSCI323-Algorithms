
# Online Python - IDE, Editor, Compiler, Interpreter

def partition(a,p,r):
    x = a[r]
    i= p-1
    for j in range(p, r):
        if a[j] <= x:
            i = i + 1
            (a[i], a[j]) = (a[j], a[i])
    (a[i+1], a[r]) = (a[r], a[i+1])
    return i+1
def quickSort(a,p,r):
    if(p<r):
        q = partition(a,p,r)
        quickSort(a,p,q-1)
        quickSort(a,p+1,r)


a = [10, 7, 8, 9, 1, 5]
quickSort(a, 0, len(a) - 1)
  
print(f'Sorted array: {a}')