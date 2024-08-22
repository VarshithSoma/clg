assume cs:code
assume ds:data
data segment
str1 db 'cse'
data ends
code segment
start:
mov ax,data
mov ds,ax
lea si,str1
lea di,str1+6
go:
mov al,[si]
mov [di],al
inc si
dec di
jnz go
int 03h
code ends
end start

