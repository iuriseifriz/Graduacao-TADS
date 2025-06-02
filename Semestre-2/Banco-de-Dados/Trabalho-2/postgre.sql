--
-- PostgreSQL database dump
--

-- Dumped from database version 17.2
-- Dumped by pg_dump version 17.2

-- Started on 2024-12-06 16:39:39

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: pg_database_owner
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO pg_database_owner;

--
-- TOC entry 4831 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 220 (class 1259 OID 16433)
-- Name: atracoes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.atracoes (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    tipo character varying(50) NOT NULL,
    capacidade integer NOT NULL
);


ALTER TABLE public.atracoes OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16432)
-- Name: atracoes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.atracoes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.atracoes_id_seq OWNER TO postgres;

--
-- TOC entry 4832 (class 0 OID 0)
-- Dependencies: 219
-- Name: atracoes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.atracoes_id_seq OWNED BY public.atracoes.id;


--
-- TOC entry 224 (class 1259 OID 16457)
-- Name: funcionarios; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.funcionarios (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    cargo character varying(50) NOT NULL,
    salario numeric(10,2) NOT NULL,
    atracaoid integer
);


ALTER TABLE public.funcionarios OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16456)
-- Name: funcionarios_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.funcionarios_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.funcionarios_id_seq OWNER TO postgres;

--
-- TOC entry 4833 (class 0 OID 0)
-- Dependencies: 223
-- Name: funcionarios_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.funcionarios_id_seq OWNED BY public.funcionarios.id;


--
-- TOC entry 222 (class 1259 OID 16440)
-- Name: ingressos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.ingressos (
    id integer NOT NULL,
    visitanteid integer NOT NULL,
    atracaoid integer NOT NULL,
    datavisita date NOT NULL
);


ALTER TABLE public.ingressos OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16439)
-- Name: ingressos_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.ingressos_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.ingressos_id_seq OWNER TO postgres;

--
-- TOC entry 4834 (class 0 OID 0)
-- Dependencies: 221
-- Name: ingressos_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.ingressos_id_seq OWNED BY public.ingressos.id;


--
-- TOC entry 218 (class 1259 OID 16412)
-- Name: visitantes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.visitantes (
    id integer NOT NULL,
    nome character varying(100) NOT NULL,
    datanascimento date NOT NULL,
    email character varying(100) NOT NULL
);


ALTER TABLE public.visitantes OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16411)
-- Name: visitantes_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.visitantes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.visitantes_id_seq OWNER TO postgres;

--
-- TOC entry 4835 (class 0 OID 0)
-- Dependencies: 217
-- Name: visitantes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.visitantes_id_seq OWNED BY public.visitantes.id;


--
-- TOC entry 4657 (class 2604 OID 16436)
-- Name: atracoes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.atracoes ALTER COLUMN id SET DEFAULT nextval('public.atracoes_id_seq'::regclass);


--
-- TOC entry 4659 (class 2604 OID 16460)
-- Name: funcionarios id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios ALTER COLUMN id SET DEFAULT nextval('public.funcionarios_id_seq'::regclass);


--
-- TOC entry 4658 (class 2604 OID 16443)
-- Name: ingressos id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ingressos ALTER COLUMN id SET DEFAULT nextval('public.ingressos_id_seq'::regclass);


--
-- TOC entry 4656 (class 2604 OID 16415)
-- Name: visitantes id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visitantes ALTER COLUMN id SET DEFAULT nextval('public.visitantes_id_seq'::regclass);


--
-- TOC entry 4821 (class 0 OID 16433)
-- Dependencies: 220
-- Data for Name: atracoes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.atracoes (id, nome, tipo, capacidade) FROM stdin;
1	Montanha Russa	Radical	20
2	Carrossel	Infantil	40
3	Roda Gigante	Moderada	30
\.


--
-- TOC entry 4825 (class 0 OID 16457)
-- Dependencies: 224
-- Data for Name: funcionarios; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.funcionarios (id, nome, cargo, salario, atracaoid) FROM stdin;
1	Ana Costa	Operadora de Montanha Russa	3000.00	1
2	Pedro Lima	Operador de Carrossel	2500.00	2
3	Luciana Pereira	Operadora de Roda Gigante	2800.00	3
\.


--
-- TOC entry 4823 (class 0 OID 16440)
-- Dependencies: 222
-- Data for Name: ingressos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.ingressos (id, visitanteid, atracaoid, datavisita) FROM stdin;
1	1	1	2024-12-06
2	2	2	2024-12-06
\.


--
-- TOC entry 4819 (class 0 OID 16412)
-- Dependencies: 218
-- Data for Name: visitantes; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.visitantes (id, nome, datanascimento, email) FROM stdin;
1	João Silva	1990-05-15	joao.silva@email.com
2	Maria Oliveira	1985-11-20	maria.oliveira@email.com
3	Carlos Souza	2000-07-10	carlos.souza@email.com
\.


--
-- TOC entry 4836 (class 0 OID 0)
-- Dependencies: 219
-- Name: atracoes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.atracoes_id_seq', 3, true);


--
-- TOC entry 4837 (class 0 OID 0)
-- Dependencies: 223
-- Name: funcionarios_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.funcionarios_id_seq', 3, true);


--
-- TOC entry 4838 (class 0 OID 0)
-- Dependencies: 221
-- Name: ingressos_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.ingressos_id_seq', 2, true);


--
-- TOC entry 4839 (class 0 OID 0)
-- Dependencies: 217
-- Name: visitantes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.visitantes_id_seq', 3, true);


--
-- TOC entry 4665 (class 2606 OID 16438)
-- Name: atracoes atracoes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.atracoes
    ADD CONSTRAINT atracoes_pkey PRIMARY KEY (id);


--
-- TOC entry 4669 (class 2606 OID 16462)
-- Name: funcionarios funcionarios_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_pkey PRIMARY KEY (id);


--
-- TOC entry 4667 (class 2606 OID 16445)
-- Name: ingressos ingressos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ingressos
    ADD CONSTRAINT ingressos_pkey PRIMARY KEY (id);


--
-- TOC entry 4661 (class 2606 OID 16419)
-- Name: visitantes visitantes_email_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visitantes
    ADD CONSTRAINT visitantes_email_key UNIQUE (email);


--
-- TOC entry 4663 (class 2606 OID 16417)
-- Name: visitantes visitantes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.visitantes
    ADD CONSTRAINT visitantes_pkey PRIMARY KEY (id);


--
-- TOC entry 4672 (class 2606 OID 16463)
-- Name: funcionarios funcionarios_atracaoid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.funcionarios
    ADD CONSTRAINT funcionarios_atracaoid_fkey FOREIGN KEY (atracaoid) REFERENCES public.atracoes(id);


--
-- TOC entry 4670 (class 2606 OID 16451)
-- Name: ingressos ingressos_atracaoid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ingressos
    ADD CONSTRAINT ingressos_atracaoid_fkey FOREIGN KEY (atracaoid) REFERENCES public.atracoes(id);


--
-- TOC entry 4671 (class 2606 OID 16446)
-- Name: ingressos ingressos_visitanteid_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.ingressos
    ADD CONSTRAINT ingressos_visitanteid_fkey FOREIGN KEY (visitanteid) REFERENCES public.visitantes(id);


-- Completed on 2024-12-06 16:39:39

--
-- PostgreSQL database dump complete
--

