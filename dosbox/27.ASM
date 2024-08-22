assume cs:code
assume ds:data
assume es:extra
data segment
str1 db 'micro'
count equ 05
data ends
extra segment
str2 db 'macro'
extra ends
code segment
start:
mov ax,data
mov ds,ax
lea si,str1
mov cl,count
mov ax,extra
mov es,ax
lea di,str2
repe cmpsb
jz l1
mov bx,0ffffh
int 03h
l1:mov bx,0h
int 03h
code ends
end start

