create view v_empresas_completo as
	select e.*, c.nome as nome_categoria
	from empresas as e
	inner join categorias as c
	on e.categoria = c.id;