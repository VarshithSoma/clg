assume cs:code
assume es:extra
extra segment
str1 db 'micro',0
count equ 0ffh
extra ends
code segment
start:
mov ax,extra
mov es,ax
lea di,str1
cld
mov al,0
repne scasb
int 03h
code ends
end start
