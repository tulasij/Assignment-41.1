object GCD
{
    def gcd(a: Int,b: Int): Int = {
       if(b ==0) a else gcd(b, a%b)
    }
     
    def main(args: Array[String]) {
        println("gcd of " + args(0) + " and " + args(1) + " is : " + gcd(args(0).toInt,args(1).toInt))
    }
}
