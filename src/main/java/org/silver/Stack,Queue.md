## Stack
# 마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 LIFO(Last In First Out)
# => 하나의 입출력 방향을 가지고 있다.
# stack.push(1);   // Stack에 값 1 추가
# stack.pop();     // Stack의 맨 위에 저장된 객체를 꺼냄(제거)
# stack.peek();    // Stack의 맨 위에 저장된 객체를 반환

## Queue
# 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO(First In First Out) 
# => 한 방향으로 넣고 한 방향으로는 빼는 파이프 같은 구조
# queue.offer(1);                           // queue에 값 1 추가
# queue.poll() :                            // queue에 첫번째 값을 꺼냄(제거)
# queue.peek() :                            // queue에 가장 위에 있는 값
# ((LinkedList<String>) queue).peekLast();  // queue의 가장 밑에 있는 값 : LinkedList 사용
#                                              LinkedList의 peekLast 메서드를 사용하여 큐의 마지막 요소를 반환