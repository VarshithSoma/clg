assume cs:code
assume es:extra
extra segment
str1 db 'micro'
count equ 05
extra ends
code segment
start:
mov ax,extra
mov es,ax
lea di,str1
mov cl,count
cld
mov al,'r'
repne scasb
jz l1
mov bx,0ffffh
int 03h
l1:
mov dx,0000h
int 03h
code ends
end start
