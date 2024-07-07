assume cs:code
assume ds:data
data segmaent
count db 0ah
list db 10 dup(?)
data end
code segment
start:
mov ax,data
mov ds,ax
mov cl,count
lea si,list
mov al,0h
mov [si],al
mov bl ,01h
go1:
inc si
add bl,al
mov [si],bl
mov al,[si-1]
dec cl
jnz go1
int 03h
code ends
end start
