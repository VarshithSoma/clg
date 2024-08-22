assume cs:code
assume ds:data
data segment
list db 04h,0ah,01h,021h,09h
count db 05h
larg db 00h
data ends
code segment
start:
mov ax,data
mov ds,ax
mov ax,00h
mov cl,count-1
lea si,list
mov al,[si]
go1:
cmp al,[si+1]
jc go2
mov al,[si+1]
go2:
inc si
dec cl
jc go1
mov larg,al
int 03h
code ends
end start
