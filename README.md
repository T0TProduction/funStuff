# funStuff
This is a collection on some fun challenges or code ideas i've had over the course of time

# abccba
The premise of this challenge was to find a!=b!=c for which this applies:

![the original problem](https://media.discordapp.net/attachments/386915523524558849/459394560301334528/unknown.png)

The code is a brute force approach, which gives us the answer pretty quick because of the <img src="http://www.sciweavers.org/tex2img.php?eq=O%28%20%5Cfrac%7B10%21%7D%7B%2810-n%29%21%7D%20%29%20&bc=White&fc=Black&im=png&fs=12&ff=arev&edit=0" align="center" border="0" alt="O( \frac{10!}{(10-n)!} ) " width="108" height="46" /> complexity with n being number of variables, which is 720 for this problem. 

If there were more possible inputs the code would've needed to be optimized, as brute force would've become unfeasable. 

In this case the maximum number of possibilities with 10 different variables would've been 3628800, which is still completely doable in seconds with processors tacted at multiple GHz.
