

# scelta_file = input('Inserisci il nome del file: ')
# tipo_file=input('Inserisci il tipo del file: ')
scelta_file = "il sottomarino.txt"
var_lettura = open(scelta_file, "r").read()

# creo una lista di numeri dal file
lista_spostamento_numerico = [int(x)for x in var_lettura.split() if x.isdigit()]


#creo una lista di stringhe dal file
lista_tipo_spostamento = [(y)for y in var_lettura.split() if y.isalpha()]

set_tipo_spostamento=set(lista_tipo_spostamento)

#unisco le due liste in una mappa 
mappa_azione = list(zip(lista_tipo_spostamento, lista_spostamento_numerico))
# print("lista_tipo_spostamento: ",lista_tipo_spostamento,"\n\n")
# print("lista_spostamento_numerico: ",lista_spostamento_numerico,"\n\n")
# print(set_tipo_spostamento,"\n\n")
# print("mappaAzione: ",mappa_azione,"\n\n")
spostamenti=list(set_tipo_spostamento)


contatore = 0
x=0
print(spostamenti)
print(len(spostamenti))




for spostamento in spostamenti:
    temp_list = list(filter(lambda x: x[0] == spostamento, mappa_azione))
    print(spostamento)
    print(temp_list)
 
    valore_da_rimuovere = spostamento[x]

    
    while x<len(spostamento):
        try:
           while True:
            temp_list.remove(valore_da_rimuovere)
        except ValueError:
           pass
 
           print(temp_list)
    

    


# azioni = []
# while x < len(spostamenti):
  
#   print(spostamenti[x])
#   while contatore <10:

#     print(spostamenti[x])
#     print(spostamenti[x+1])
    
#     valore_da_rimuovere=(spostamenti[x],contatore)
#     secvalore_da_rimuovere=(spostamenti[x+1],contatore)
#     temp_list = [valore for valore in mappa_azione if valore!= valore_da_rimuovere  and valore!= secvalore_da_rimuovere ]
#     azioni.append(temp_list)
#     contatore = contatore + 1    
#   # print(mappa_azione,"\n\n")

  #print(azioni)
  #contatore = contatore + 1    

  #x=x + 1



   
   
   
# mappa_azione_F = [valore for valore in mappa_azione_F if valore!= valore_da_rimuovereU  and valore!= valore_da_rimuovereD ]
# mappa_azione_U = [valore for valore in mappa_azione_U if valore!= valore_da_rimuovereF and valore!= valore_da_rimuovereD ]
# mappa_azione_D = [valore for valore in mappa_azione_D if valore!= valore_da_rimuovereF and valore!= valore_da_rimuovereU]
    
# print(mappa_azione_F)
# print(mappa_azione_U)
# print(mappa_azione_D)

 
# spostamenti_f = [int(x)for x in mappa_azione_f.split() if x.isdigit()]
# somma_f=sum(spostamenti_f)
# print(spostamenti_f)
# print(somma_f)
# index_tipo_F=lista_tipo_spostamento.index("forward")
# index_tipo_D=lista_tipo_spostamento.index("down")
# index_tipo_U=lista_tipo_spostamento.index("up")


# print(index_tipo_F)
# print(index_tipo_D)
# print(index_tipo_U)
















# #############################################################
# #ottengo come set le chiavi castando la lista in set

# set_tipo_spostamento=set(lista_tipo_spostamento)

# print("set tipi di spostamenti",set_tipo_spostamento,"\n\n")







# #ottengo i valori delle 3 chiavi salvate era meglio farlo dinamico con un ciclo

# #ricasto gli elementi in lista , cosi da accedere con l'index
# lista_spostamenti=list(set_tipo_spostamento)


# # valori_f=mappaAzione
# # valori_d=mappaAzione.getattr(lista_spostamenti[1])
# # valori_u=mappaAzione.getattr(lista_spostamenti[7])


# # print(valori_f)
# # print(valori_d)
# # print(valori_u)

# # # sommo tutti i valori di un determinato spostamento in base alla chiave del tipo di spostamento
# # somma_f=sum(valori_f)
# # somma_d=sum(valori_d)
# # somma_u=sum(valori_u)

# # print(somma_f)
# # print(somma_d)
# # print(somma_u)

# # altezza=somma_u-somma_f

# # posizione_finale=[somma_f,altezza]

# # print(posizione_finale)


# #  #ciclo gli elementi della lista e li stampo
# # for lista_tipo_spostamento, lista_spostamento_numerico in mappaAzione.items():
# #     print (lista_tipo_spostamento, lista_spostamento_numerico,"\n\n")
# # 0