INSERT INTO types (typeId, name, description, extension) VALUES
('41e2d211-6396-4f23-9690-77bc2820d84b', 'PDF', 'Portable Document Format', '.pdf');

INSERT INTO types (typeId, name, description, extension) VALUES
('e8e5310b-6345-4d08-86b6-d5c3c299aa7f', 'NOTE', 'Text Notes', '.txt');

INSERT INTO types (typeId, name, description, extension) VALUES
('4980d2e4-a424-4ff4-a0b2-476039682f43', 'WEB', 'Web Link', '.url');

INSERT INTO types (typeId, name, description, extension) VALUES
('c9f1a16d-852d-4132-b4b8-ead20aafc6ef', 'WORD', 'Microsoft Word', '.doc?');

INSERT INTO documents (documentId, name, location, description, typeId ) VALUES
('1acbb68a-a859-49c9-ac88-d9e9322bac55', 'Book Template', '/docs/isfbook/Documents/Random/Book
Template.pdf', 'A book template for creating new books', '41e2d211-6396-4f23-9690-77bc2820d84b');

INSERT INTO documents (documentId, name, location, description, typeId) VALUES
('cf7fec3e-55bf-426d-8a6f-2ca752ae34ac', 'Sample Contract', '/docs/isfbook/Documents/Contracts/
Sample Contract.pdf', 'Just a Contract', '41e2d211-6396-4f23-9690-77bc2820d84b');

INSERT INTO documents (documentId, name, location, description, typeId) VALUES
('3580f482-7f12-4787-bb60-c98023d47b6c', 'Clustering with RabbitMQ', '/Users/isfbook/Documents/
Random/Clustering with RabbitMQ.txt', 'Simple notes ', 'e8e5310b-6345-4d08-86b6-d5c3c299aa7f');

INSERT INTO documents (documentId, name, location, description, typeId)
VALUES ('431cddbf-f3c0-4076-8c1c-564e7dce16c9', 'Pro Spring Security Book',
'http://www.apress.com/9781430248187', 'Excellent Book', '4980d2e4-a424-4ff4-a0b2-476039682f43');
