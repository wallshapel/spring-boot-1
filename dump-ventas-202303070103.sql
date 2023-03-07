--
-- PostgreSQL database dump
--

-- Dumped from database version 12.12
-- Dumped by pg_dump version 12.12

-- Started on 2023-03-07 01:03:53

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 6 (class 2615 OID 48246)
-- Name: fundamentos; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA fundamentos;


ALTER SCHEMA fundamentos OWNER TO postgres;

--
-- TOC entry 3 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 2825 (class 0 OID 0)
-- Dependencies: 3
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 204 (class 1259 OID 48249)
-- Name: cliente; Type: TABLE; Schema: fundamentos; Owner: postgres
--

CREATE TABLE fundamentos.cliente (
    id integer NOT NULL,
    apellidos character varying(150) NOT NULL,
    direccion character varying(150),
    email character varying(55),
    nombre character varying(75) NOT NULL,
    telefono character varying(150)
);


ALTER TABLE fundamentos.cliente OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 48247)
-- Name: cliente_id_seq; Type: SEQUENCE; Schema: fundamentos; Owner: postgres
--

CREATE SEQUENCE fundamentos.cliente_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE fundamentos.cliente_id_seq OWNER TO postgres;

--
-- TOC entry 2826 (class 0 OID 0)
-- Dependencies: 203
-- Name: cliente_id_seq; Type: SEQUENCE OWNED BY; Schema: fundamentos; Owner: postgres
--

ALTER SEQUENCE fundamentos.cliente_id_seq OWNED BY fundamentos.cliente.id;


--
-- TOC entry 2689 (class 2604 OID 48252)
-- Name: cliente id; Type: DEFAULT; Schema: fundamentos; Owner: postgres
--

ALTER TABLE ONLY fundamentos.cliente ALTER COLUMN id SET DEFAULT nextval('fundamentos.cliente_id_seq'::regclass);


--
-- TOC entry 2819 (class 0 OID 48249)
-- Dependencies: 204
-- Data for Name: cliente; Type: TABLE DATA; Schema: fundamentos; Owner: postgres
--

COPY fundamentos.cliente (id, apellidos, direccion, email, nombre, telefono) FROM stdin;
2	Bluesummers	Carrera 29 no 79 53 piso 2	legato@hotmail.com	Legato	3004349093
4	Ufre	Olaya	nabila@hotmail.com	Nabila	3004349096
6	Llinás	La playa	karoll@hotmail.com	Karoll	3013509094
\.


--
-- TOC entry 2827 (class 0 OID 0)
-- Dependencies: 203
-- Name: cliente_id_seq; Type: SEQUENCE SET; Schema: fundamentos; Owner: postgres
--

SELECT pg_catalog.setval('fundamentos.cliente_id_seq', 6, true);


--
-- TOC entry 2691 (class 2606 OID 48257)
-- Name: cliente cliente_pkey; Type: CONSTRAINT; Schema: fundamentos; Owner: postgres
--

ALTER TABLE ONLY fundamentos.cliente
    ADD CONSTRAINT cliente_pkey PRIMARY KEY (id);


-- Completed on 2023-03-07 01:03:54

--
-- PostgreSQL database dump complete
--

