insert into administradores(login, senha)
    values('admin', md5('123456789'));


insert into categorias(nome) 
    values('Supermercados e Mercearias'),
    ('Lojas de Roupas'),
    ('Lojas Automotivas'),
    ('Restaurantes e Lanchonetes'),
    ('Farmácias'),
    ('Lojas de Eletrônicos'),
    ('Lojas de Móveis'),
    ('Padarias'),
    ('Lojas de Artigos Esportivos'),
    ('Livrarias'),
    ('Lojas de Brinquedos'),
    ('Joalherias'),
    ('Lojas de Calçados'),
    ('Lojas de Beleza e Cosméticos'),
    ('Pet Shops'),
    ('Lojas de Material de Construção'),
    ('Floriculturas');
  
use catalogo_comercios;

   insert into empresas (nome, email, telefone, endereco, bairro, cidade, complemento, categoria)
   values 
('Supermercado Central', 'contato@supermercadocentral.com', '12345678901', 'Rua das Flores, 123', 'Centro', 'Ceres', 'Complemento 1', 1),
('Boutique Elegância', 'atendimento@boutiqueelegancia.com', '12345678902', 'Avenida da Moda, 456', 'Jardins', 'Ceres', 'Complemento 2', 2),
('Auto Peças Veloz', 'vendas@autopecasveloz.com', '12345678903', 'Rua dos Motores, 789', 'Industrial', 'Ceres', 'Complemento 3', 3),
('Restaurante Saboroso', 'reservas@restaurantesaboroso.com', '12345678904', 'Praça dos Sabores, 321', 'Gastronômico', 'Ceres', 'Complemento 4', 4),
('Farmácia Bem Estar', 'sac@farmaciabemestar.com.br', '12345678905', 'Avenida da Saúde, 654', 'Medicinais', 'Ceres', 'Complemento 5', 5),
('Eletrônicos Conectados', 'suporte@eletronicosconectados.com', '12345678906', 'Rua das Inovações,987', 'Tecnológico', 'Ceres', 'Complemento6', 6),
('Móveis Conforto', 'vendas@moveisconforto.com.br', '12345678907', 'Avenida do Lar,135', 'Residencial', 'Ceres', 'Complemento7', 7),
('Padaria Pão Quente', 'contato@padariapaoquente.com.br', '12345678908', 'Praça do Trigo,246', 'Alimentício', 'Ceres', 'Complemento8', 8),
('Esportes em Ação', 'atendimento@esportesemacao.com.br', '12345678909', 'Rua da Atividade,369', 'Esportivo', 'Ceres', 'Complemento9', 9),
('Livraria Saber Mais', 'sac@livrariasabemais.com.br', '12345678910', 'Avenida do Conhecimento,852', 'Educacional', 'Ceres', 'Complemento10', 10),
('Brinquedos Alegria', 'contato@brinquedosalegria.com', '12345678911', 'Rua da Diversão, 123', 'Infantil', 'Ceres', 'Complemento 11', 11),
('Joalheria Brilho Eterno', 'atendimento@joalheriabriloeterno.com', '12345678912', 'Avenida das Gemas, 456', 'Luxo', 'Ceres', 'Complemento 12', 12),
('Calçados Confortáveis', 'vendas@calcadosconfortaveis.com', '12345678913', 'Rua do Caminhar, 789', 'Moda', 'Ceres', 'Complemento 13', 13),
('Beleza e Cosméticos Radiantes', 'sac@belezaradiante.com.br', '12345678914', 'Praça da Beleza, 321', 'Estética', 'Ceres', 'Complemento 14', 14),
('Pet Shop Amigo Fiel', 'suporte@petshopamigofiel.com', '12345678915', 'Avenida dos Animais,654', 'Pet', 'Ceres', 'Complemento15', 15),
('Materiais de Construção Fortaleza', 'vendas@materiaisfortaleza.com.br', '12345678916', 'Rua da Construção,987', 'Construção', 'Ceres', 'Complemento16', 16),
('Floricultura Flores e Cores', 'contato@florescores.com.br', '12345678917', 'Praça das Flores,135', 'Jardim', 'Ceres', 'Complemento17', 17),
('Supermercado Preço Justo', 'atendimento@supermercadoprecojusto.com.br', '12345678918', 'Avenida das Compras,246', 'Alimentício', 'Ceres', 'Complement18', 1),
('Restaurante Prato Cheio', 'reservas@restaurantpratocheio.com.br', '12345678919', 'Rua dos Sabores,369', 'Gastronômico', 'Ceres', 'Complemento19', 4),
('Farmácia Saúde Garantida', 'sac@farmaciasaudegarantida.com.br', '12345678920', 'Avenida da Saúde,852', 'Saúde', 'Ceres', 'Complemento20', 5),
('Loja de Móveis Conforto', 'contato@moveisconforto.com', '12345678921', 'Rua do Descanso, 123', 'Residencial', 'Ceres', 'Complemento 21', 7),
('Eletrônicos Modernos', 'atendimento@eletronicosmodernos.com', '12345678922', 'Avenida da Tecnologia, 456', 'Tecnológico', 'Ceres', 'Complemento 22', 6),
('Padaria Pão Quentinho', 'vendas@padariapaoquentinho.com', '12345678923', 'Rua do Trigo, 789', 'Alimentício', 'Ceres', 'Complemento 23', 8),
('Artigos Esportivos Campeões', 'sac@esportivoscampeoes.com.br', '12345678924', 'Praça do Esporte, 321', 'Esportivo', 'Ceres', 'Complemento 24', 9),
('Livraria Saber Sempre', 'suporte@sabersempre.com', '12345678925', 'Avenida do Conhecimento,654', 'Educacional', 'Ceres', 'Complemento25', 10),
('Brinquedos Divertidos', 'vendas@brinquedosdivertidos.com.br', '12345678926', 'Rua da Alegria,987', 'Infantil', 'Ceres', 'Complemento26', 11),
('Joalheria Luxo Eterno', 'contato@joalherialuxoeterno.com.br', '12345678927', 'Praça das Gemas,135', 'Luxo', 'Ceres', 'Complemento27', 12),
('Calçados Estilosos', 'atendimento@calcadosestilosos.com.br', '12345678928', 'Avenida da Moda,246', 'Moda', 'Ceres', 'Complemento28', 13),
('Beleza e Cosméticos Radiantes', 'reservas@belezaradiante.com.br', '12345678929', 'Rua da Beleza,369', 'Estética', 'Ceres', 'Complemento29', 14),
('Pet Shop Amor Animal', 'sac@petshopamoranimal.com.br', '12345678930', 'Avenida dos Animais,852', 'Pet', 'Ceres', 'Complemento30', 15),
('Materiais de Construção Resistência', 'contato@materiaisresistencia.com', '12345678931', 'Rua da Resistência, 123', 'Construção', 'Ceres', 'Complemento 31', 16),
('Floricultura Beleza Natural', 'atendimento@belezanatural.com', '12345678932', 'Avenida das Flores, 456', 'Jardim', 'Ceres', 'Complemento 32', 17);
