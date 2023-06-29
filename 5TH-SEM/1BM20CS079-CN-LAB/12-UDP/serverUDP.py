from socket import *
serverPort = 12000
serverSocket = socket(AF_INET, SOCK_DGRAM)
serverSocket.bind(("127.0.0.1", serverPort))
print("The server is ready to receive")
while 1:
    sentence, clientAddress = serverSocket.recvfrom(2048)
    sentence = sentence.decode("utf-8")
    sentence = sentence.upper()
    serverSocket.sendto(bytes(sentence, "utf-8"), clientAddress)
    print('\nSent contents of ', end=' ')
    print(sentence)
# for i in sentence:
# print (str(i), end = '')
