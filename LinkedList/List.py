import random;
class Node:

    def __init__(self):
        self.data = (int) (1 + 10 * random.random());
        self.next = None

class LinkedList:

    def __init__(self):
        self.head = None
        self.length = 0;


    def generateList(self, num):
        head = Node();
        
        self.head = head;
        self.length = num;

        for x in range(num):
            newNode = Node()
            traverse = head

            if (head.next == None):
                head.next = newNode

            while (traverse.next != None):
                traverse = traverse.next

            traverse.next = newNode;
            newNode.next = None;
    
    def toString(self):
        traverse = self.head;
        s = "";
        for x in range(self.length):
            if (x < self.length - 1):
                s += str(traverse.data) + " -> "
            else:
                s += str(traverse.data)
            traverse = traverse.next
        return s;

    def sortList(self):
        sortList = LinkedList();
        currList = self.head
        sortList.length = self.length

        while(currList != None and currList.next != None):
            newNode = Node()
            newNode.data = currList.data
            
            currList = currList.next

            if (sortList.head == None):
                sortList.head = newNode
            else:
                traverse = sortList.head
                if (newNode.data >= sortList.head.data):
                    temp = sortList.head.data
                    sortList.head.data = newNode.data
                    newNode.data = temp

                    newNode.next = sortList.head.next
                    sortList.head.next = newNode
                else:
                    while (traverse.next != None and newNode.data < traverse.next.data):
                        traverse = traverse.next
                    newNode.next = traverse.next
                    traverse.next = newNode
        return sortList;
             
if __name__ == "__main__":
    list = LinkedList()
    list.generateList(10)
    print list.toString()
    list = list.sortList()
    print list.toString()
    


