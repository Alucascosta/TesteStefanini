#language: pt
#Author: andrelucasjeri@hotmail.com

@executar
Funcionalidade: Validar Tela de Cadastro
  Eu como usuario quero Verificar todas as combinações 
      	
    
    Cenario: Validar que a tela de cadastro esteja aberta com sucesso 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Entao eu valido <retorno> 

    Exemplos: 
             | retorno           | 
             | "Formulário"      |
             

    Cenario: Realizar cadastro sem o campo nome preeenchido 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome              | e_mail           |senha                 | retorno                     |
      |""                |"teste1@teste.com"|"123teste"            |"O campo Nome é obrigatório."|
      
      
  
  Cenario: Realizar cadastro sem o campo email preeenchido 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome              | e_mail    |senha     | retorno                       |
      |"Victor Luiz"     |""         |"123teste"|"O campo E-mail é obrigatório."|
      
      
      Cenario: Realizar cadastro sem o campo Senha preeenchido 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome               | e_mail           |senha    | retorno                      |
      |"Johnatan vinicius"|"teste3@teste.com"|""       |"O campo Senha é obrigatório."|
  
  Cenario: Realizar cadastro sem nenhum campo preenchido
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido mais de um <retorno1> <retorno2> <retorno3>


    Exemplos: 
      |nome | e_mail | senha| retorno1                    | retorno2                        | retorno3                       |
      |   ""|   ""   |  ""  |"O campo Nome é obrigatório."|  "O campo E-mail é obrigatório."|  "O campo Senha é obrigatório."|
      
      
     Cenario: Realizar cadastro com o campo nome Preenchido sem sobrenome 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome              | e_mail           |senha                 | retorno                                   |
      |"Alex"            |"teste@teste.com" |"123teste"            |"Por favor, insira um nome completo."      |
    
    
     Cenario: Realizar cadastro email invalido 
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome            | e_mail           |senha                 | retorno                             |
      |"José carlos"   |"testecom"        |"123teste"            |"Por favor, insira um e-mail válido."|
    
    
    Cenario: Realizar cadastro com senha Invalida(Menos de oito caracteres)
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retorno> 


    Exemplos: 
      |nome        | e_mail           |senha                 | retorno                                |
      |"Alex diego"|"teste@teste.com" |"123t"            |"A senha deve conter ao menos 8 caracteres."|

Cenario: Realizar cadastro com sucesso e validar usuario cadastrado
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido o usuario cadastrado <retornoUsuario> 

    Exemplos: 
      |nome         | e_mail           |senha      | retornoUsuario       |        
      |"Alex diego" |"teste@teste.com" |"123teste" |"Usuários cadastrados"|   

Cenario: Realizar dois cadastros com sucesso e validar usuarios cadastrados
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
		Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    Entao eu valido <retornoUsuario> <retornoId> <retornoNome> <retornoEmail> <retornoAcoes>

    Exemplos: 
      |nome            | e_mail           |senha      | retornoUsuario       | retornoId | retornoNome| retornoEmail| retornoAcoes       |
      |"José Henrique" |"teste@teste.com" |"123teste" |"Usuários cadastrados"|    "Id"   | "Nome"     |"E-mail"     |    "Ações"         |
     
     Cenario: Realizar dois cadastros com sucesso e excluir um usuario cadastrado
    Dado que eu esteja no  "http://prova.stefanini-jgr.com.br/teste/qa/"
    Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
		Quando eu Digitar no campo nome <nome> 
    E eu digitar no campo email <e_mail>
    E eu digitar no campo senha <senha>
    E clicar em Cadastrar
    E clicar em excluir
    Entao eu valido <retornoUsuario> <retornoExcluir> 
    

    Exemplos: 
      |nome            | e_mail           |senha      | retornoUsuario       | retornoExcluir|
      |"José Henrique" |"teste@teste.com" |"123teste" |"Usuários cadastrados"|    "Excluir"  | 
     
      
  
 
    
      