all:
	g++ -std=c++17 hello.cpp -o hello;chmod +x hello
	g++ -std=c++17 helloTest.cpp -o helloTest 

test:
	./helloTest
clean:
	$(RM) hello helloTest
