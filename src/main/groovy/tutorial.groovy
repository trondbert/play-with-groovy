myList = ["a": 1, "b": 2]

myList.each({println it.key + "=>" + it.value})

println "bae" > "abd"

def readable = { it.put("12 34".reverse()); 5 } as Readable
def s = new Scanner(readable)
assert s.nextInt() == 43

impl = [
  i: 10,
  hasNext: { impl.i > 0 },
  next: { impl.i-- }
]
iter = impl as Iterator
while (iter.hasNext())
  println iter.next()
  
x = "test" //don't have to have "def"
println x 

println "========= File tricks============"
new File("src/main/resources").eachFile { 
	file ->
	if (file.name ==~ /.*\.groovy/) {
		println file.name
	}	 
}


