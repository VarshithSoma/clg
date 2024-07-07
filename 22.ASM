assume cs:code
assume ds:data
data segment
list db 01h,02h,03h,04h,05h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov cl,05h
go3:
lea si,list
mov dl,[si+4]
go1:
mov al,[si]
cmp al,[si+1]
jnz go2
xchg al,[si+1]
mov [si],al
go2:
inc si
dec dl
jnz go1
dec cl
jnz go3
int 03h
code ends
end start
