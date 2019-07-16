import datetime
class Function:

    # gcd(m,n) 返回m,n最大公约数 m,n要为整数,采用辗转相除法
    @staticmethod
    def gcd(m, n):
        while n != 0:
            tmp = n
            n = m % n
            m = tmp
        return m

    # sum(n) 求1+2+..n的和,n为正整数
    @staticmethod
    def sum(n):
        cnt = 0
        while n > 0:
            cnt = cnt+n
            n = n-1
        return cnt

    # fib(n) 返回前n项斐波那契项
    @staticmethod
    def fib2(n):
        list = []
        a, b = 0, 1
        if n == 0:
            return list
        list.append(a)
        n = n-1
        while n > 0:
            a, b = b, a+b
            list.append(a)
            n = n-1
        return list

    # factorial(n) 返回n的阶乘，n大于等于0
    @staticmethod
    def factorial(n):
        if n < 0:
            return -1
        if n == 0 or n == 1:
            return 1
        cnt = n - 1
        while cnt > 1:
            n = n * cnt
            cnt = cnt - 1
        return n

    # prime(n) 返回n以内的素数个数
    @staticmethod
    def prime(n):
        start = datetime.datetime.now()
        count = 1
        total = 0
        # print(2)
        for i in range(3, n, 2):
            for j in range(3, int(i ** 0.5) + 1, 2):
                total += 1
                if i % j == 0:
                    break
            else:
                # print(i)
                count += 1
        detal = (datetime.datetime.now() - start).total_seconds()
        print("The number of prime is :", count)
        print("The total traversal is :", total)
        print("The time is :", detal)
        return count