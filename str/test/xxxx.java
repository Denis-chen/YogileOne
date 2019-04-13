//**************************
//Fast Exponent Calculate
//**************************

#include <stdio.h>
#include <math.h>

int coprime(int x, int y){
//
    int r=x%y;
    while(r!=0){
        x=y;
        y=r;
        r=x%y;
    }
    if(y==1) return 1;
    return 0;
}

int fermat(int x, int y){
//
    int i, res=1;
    for(i=1; i<y; ++i){
        res*=x;
        res%=y;
    }
    if(res%y==1) return 0;
    return 1;
}

int main(){
//
    int b, n;
    scanf("%d", &n);
    for(b=2; b<n; ++b){
        if(coprime(b, n)){
            if(fermat(b, n)){
                printf("This is a composite number.\n");
                printf("%d, %d", b, n);
                return 0;
            }
        }
    }
    printf("This is a prime number.\n");
    return 0;
}

#include <stdio.h>
#include <math.h>

int isprime(long long n){
//
    int i;
    long long s;
    s=sqrt(n);
    for(i=2; i<=s; i++){
        if(n%i==0) return 0;
    }
    return 1;
}

int main(){
//
    int p[40], c, i, j=0;
    long long res;
    for(i=1; i<40; i++){
        if(isprime(i)) p[j++]=i;
    }
    c=j;
    for(i=0; i<c; i++){
        res=1;
        for(j=0; j<=i; j++){
            res*=p[j];
            printf("%d*", p[j]);
        }
        res++;
        if(isprime(res)) printf("\b+1=%lld is a prime number.\n\n", res);
        else{
            printf("\b+1=%lld is a composite number.\n", res);
            printf("\tHalf of its factors are as follows: ");
            for(j=2; j<=sqrt(res); j++){
                if(res%j==0) printf("%d ", j);
            }
            printf("\b\n\n");
        }
    }
    return 0;
}

#include "stdafx.h"
#include "math.h"
#include "iostream"
#define MAX 100
#define S 8
using namespace std;
int hf(int b,int n)
{
	if (b==0)
	{
		return 0;
	}
    if (b==1)
    {
		return 1;
    }
	if (b==2)
		{int r=pow(-1,double((n*n-1)/8));
	return (r);}
	else if (b%2==0)
	{
		int r=pow(-1,double((n*n-1)/8))*hf(b/2,n);
		return (r);
	}
	else 
	{
	   int r=pow(-1,double((b-1)*(n-1)/4))*hf(n%b,b);
	   return (r);
	}
	
};
typedef long  LL;

/*将十进制转化成二进制存放在数组中*/ 
int decToBinary(LL x, int tb[])
{
	LL tmp = x;
	int len = 0;
	while (tmp)
	{
		tb[len++] = tmp % 2;
		tmp /= 2;
	}
	return len - 1;  
}

/*扩展欧几里得*/ 
LL exgcd(LL a, LL b, LL &x, LL &y)
{
	if (b == 0)
	{
		x = 1;
		y = 0;
		return a;
	}
	LL r = exgcd(b, a % b, x, y);
	LL t = x;
	x = y;
	y = t - a / b * y;
	return r; 
}

/*求逆元*/ 
LL inverseElement(LL a, LL n)
{
	LL x, y;
	exgcd(a, n, x, y);
	if (x < 0)
		x += (-x / n + 1) * n;
	return x % n;
}

/*montgomery变量初始化*/ 
void montInit(LL n, LL &nn, LL &r, LL &s)
{
	int nBinary[MAX], tn;
	tn = decToBinary(n, nBinary);
	s = (LL)tn + 1;
	r = 1LL << s;
	nn = r - inverseElement(n, r); 
}

/*montgomery快速乘法*/ 
LL montgomery(LL x, LL y, LL n, LL nn, LL r, LL s)
{
	LL ret = x * y;       
	LL u = (ret & (r - 1)) * nn & (r - 1);  /*使用位运算&代替%加速执行*/
	ret = (ret + u * n) >> s;  /*使用位运算>>代替/加速执行*/
	if (ret >= n) 
		ret -= n;
	return ret;
}

/*montgomery幂取模*/ 
LL montMod(LL a, LL b, LL n)
{
	if ((n & 1) == 0)   /* n为偶数不适用 */ 
	{
		// printf("模数不能为偶数\n"); 
		return -1;
	}
	a %= n;
	LL nn, r, s;
	montInit(n, nn, r, s);
	LL ret, aa;
	aa = montgomery(a, r * r % n, n, nn, r, s);
	ret = r % n;
	while (b)            /*模幂从左向右*/
	{
		if (b & 1)
			ret = montgomery(ret, aa, n, nn, r, s);
		b >>= 1;
		aa = montgomery(aa, aa, n, nn, r, s);
	}
	ret = montgomery(ret, 1, n, nn, r, s);
	return ret;
}

bool witness(LL a, LL n, int t, LL u){
	LL x, x2;
	x = montMod(a, u, n);   /*montgomery mod*/ 
	for (int i = 1; i <= t; ++i){
		x2 = x * x % n;
		if (x2 == 1 && x != 1 && x != n - 1)
			return true;
		x = x2;
	}
	if (x2 != 1)
		return true;
	return false;
}

int _tmain(int argc, _TCHAR* argv[])
{
	int b,n;
	cout<<"输入需要判别的大数:";
	cin>>n;
	for(b=2;b<n;b++)
	{
		int r1=hf(b,n)%n;
		if(r1<0)
			r1+=n;
		long int r0=montMod(long int(b),long int((n-1)/2),long int(n));
		if(r1!=r0)
		{cout<<n<<"不是素数";
	      return 0;
	     }
	}
	long long int d;
	cout<<"n可能是素数";
}


#include <stdio.h>
#include <string.h>
#include <time.h>
#include <stdlib.h>
#define MAX 100
#define S 8
typedef long long LL;

/*灏嗗崄杩涘埗杞寲鎴愪簩杩涘埗瀛樻斁鍦ㄦ暟缁勪腑*/ 
int decToBinary(LL x, int tb[])
{
   LL tmp = x;
   int len = 0;
   while (tmp)
   {
      tb[len++] = tmp % 2;
      tmp /= 2;
   }
   return len - 1;  
}

/*鎵╁睍娆у嚑閲屽緱*/ 
LL exgcd(LL a, LL b, LL &x, LL &y)
{
   if (b == 0)
   {
      x = 1;
      y = 0;
      return a;
   }
   LL r = exgcd(b, a % b, x, y);
   LL t = x;
   x = y;
   y = t - a / b * y;
   return r; 
}

/*姹傞€嗗厓*/ 
LL inverseElement(LL a, LL n)
{
   LL x, y;
   exgcd(a, n, x, y);
   if (x < 0)
      x += (-x / n + 1) * n;
   return x % n;
}

/*montgomery鍙橀噺鍒濆鍖?/ 
void montInit(LL n, LL &nn, LL &r, LL &s)
{
   int nBinary[MAX], tn;
   tn = decToBinary(n, nBinary);
   s = (LL)tn + 1;
   r = 1LL << s;
   nn = r - inverseElement(n, r); 
}

/*montgomery蹇€熶箻娉?/ 
LL montgomery(LL x, LL y, LL n, LL nn, LL r, LL s)
{
   LL ret = x * y;       
   LL u = (ret & (r - 1)) * nn & (r - 1);  /*浣跨敤浣嶈繍绠?浠ｆ浛%鍔犻€熸墽琛?/
   ret = (ret + u * n) >> s;  /*浣跨敤浣嶈繍绠?>浠ｆ浛/鍔犻€熸墽琛?/
   if (ret >= n) 
      ret -= n;
   return ret;
}
 
/*montgomery骞傚彇妯?/ 
LL montMod(LL a, LL b, LL n)
{
   if ((n & 1) == 0)   /* n涓哄伓鏁颁笉閫傜敤 */ 
   {
     // printf("妯℃暟涓嶈兘涓哄伓鏁癨n"); 
      return -1;
   }
   a %= n;
   LL nn, r, s;
   montInit(n, nn, r, s);
   LL ret, aa;
   aa = montgomery(a, r * r % n, n, nn, r, s);
   ret = r % n;
   while (b)            /*妯″箓浠庡乏鍚戝彸*/
   {
      if (b & 1)
         ret = montgomery(ret, aa, n, nn, r, s);
      b >>= 1;
      aa = montgomery(aa, aa, n, nn, r, s);
   }
   ret = montgomery(ret, 1, n, nn, r, s);
   return ret;
}

bool witness(LL a, LL n, int t, LL u){
   LL x, x2;
   x = montMod(a, u, n);   /*montgomery mod*/ 
   for (int i = 1; i <= t; ++i){
      x2 = x * x % n;
      if (x2 == 1 && x != 1 && x != n - 1)
         return true;
      x = x2;
   }
   if (x2 != 1)
      return true;
   return false;
}

/* true涓虹礌鏁? flase涓嶄负绱犳暟 */ 
bool Miller_Rabin(LL n, int s){
	if (n==2)
		return true;
   if (n <= 1 || n % 2 == 0)
      return false;
   if (n <= 3)
      return true;
   LL a, tmp;
   LL u = n - 1;
   int t = 0;
   while (u % 2 == 0){
      t++;
      u /= 2;
   }
   for (int i = 1; i <= s; ++i){
 	/*闅忔満娴嬭瘯s涓暟瀛?/
      a = rand() % (n - 3) + 2; /* 2 <= a <= n - 2 */
      if (witness(a, n, t, u))
         return false;
   }   
   return true;
}

int main(){
   srand(time(0)); 
   LL n;
   printf("Miller-Rabin Test\n");
   while (scanf("%lld", &n) != EOF){
      if (Miller_Rabin(n, S))
         printf("%lld is prime\n", n);
      else
         printf("%lld is not prime\n", n);
   }
   return 0;
}

