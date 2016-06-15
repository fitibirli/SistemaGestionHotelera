CREATE DATABASE  IF NOT EXISTS `bd-sistema-gestion-hotelera` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd-sistema-gestion-hotelera`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bd-sistema-gestion-hotelera
-- ------------------------------------------------------
-- Server version	5.6.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `dni` int(15) DEFAULT NULL,
  `idContacto` int(11) NOT NULL DEFAULT '0',
  `idDireccion` int(11) NOT NULL DEFAULT '0',
  `idLogin` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`idCliente`,`idLogin`,`idDireccion`,`idContacto`),
  KEY `fk_cliente_contacto1_idx` (`idContacto`),
  KEY `fk_cliente_direccion1_idx` (`idDireccion`),
  KEY `fk_cliente_login1_idx` (`idLogin`),
  CONSTRAINT `fk_cliente_contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_direccion1` FOREIGN KEY (`idDireccion`) REFERENCES `direccion` (`idDireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_login1` FOREIGN KEY (`idLogin`) REFERENCES `login` (`idLogin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contacto` (
  `idContacto` int(11) NOT NULL AUTO_INCREMENT,
  `telefono` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idContacto`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
INSERT INTO `contacto` VALUES (1,'12345678','87654321','ElFilipitoRodri@gmail.com');
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `idDireccion` int(11) NOT NULL AUTO_INCREMENT,
  `calle` varchar(80) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `codigoPostal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDireccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `legajo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido` varchar(45) DEFAULT NULL,
  `dni` int(15) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `idContacto` int(11) NOT NULL,
  `idTipoEmpleado` int(11) NOT NULL,
  `idLogin` int(11) NOT NULL,
  PRIMARY KEY (`legajo`,`idContacto`,`idTipoEmpleado`,`idLogin`),
  KEY `fk_empleado_contacto1_idx` (`idContacto`),
  KEY `fk_empleado_tipoempleado1_idx` (`idTipoEmpleado`),
  KEY `fk_empleado_login1_idx` (`idLogin`),
  CONSTRAINT `fk_empleado_contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleado_tipoempleado1` FOREIGN KEY (`idTipoEmpleado`) REFERENCES `tipoempleado` (`idTipoEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleado_login1` FOREIGN KEY (`idLogin`) REFERENCES `login` (`idLogin`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'Rodriguez','Filipito',12345678,'2016-06-15',1,1,1);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadia`
--

DROP TABLE IF EXISTS `estadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadia` (
  `idEstadia` int(11) NOT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `fechaSalida` date DEFAULT NULL,
  `idEstadoEstadia` int(11) NOT NULL,
  `idTicket` int(11) DEFAULT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idEstadoEstadia`),
  KEY `fk_Estadia_TipoEstado1_idx` (`idEstadoEstadia`),
  KEY `fk_estadia_cliente` (`idEstadia`),
  KEY `ticketsConstraint` (`idTicket`),
  KEY `fk_estadia_cliente1_idx` (`idCliente`),
  CONSTRAINT `estadoEstadiaConstraint` FOREIGN KEY (`idEstadoEstadia`) REFERENCES `estadoestadia` (`idEstadoEstadia`),
  CONSTRAINT `ticketsConstraint` FOREIGN KEY (`idTicket`) REFERENCES `ticket` (`idTicket`),
  CONSTRAINT `fk_estadia_cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadia`
--

LOCK TABLES `estadia` WRITE;
/*!40000 ALTER TABLE `estadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estadoestadia`
--

DROP TABLE IF EXISTS `estadoestadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estadoestadia` (
  `idEstadoEstadia` int(11) NOT NULL,
  PRIMARY KEY (`idEstadoEstadia`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadoestadia`
--

LOCK TABLES `estadoestadia` WRITE;
/*!40000 ALTER TABLE `estadoestadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `estadoestadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `idFactura` int(11) NOT NULL,
  `fechaEmision` date DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  `idItemFactura` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idFactura`,`legajo`),
  KEY `fk_Factura_Empleado1_idx` (`legajo`),
  KEY `fk_Factura_Item1_idx` (`idItemFactura`),
  KEY `fk_factura_cliente1_idx` (`idCliente`),
  CONSTRAINT `fk_Factura_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Factura_Item1` FOREIGN KEY (`idItemFactura`) REFERENCES `itemfactura` (`idItemFactura`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_factura_cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `formadepago`
--

DROP TABLE IF EXISTS `formadepago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `formadepago` (
  `idFormaDePago` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idFormaDePago`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `formadepago`
--

LOCK TABLES `formadepago` WRITE;
/*!40000 ALTER TABLE `formadepago` DISABLE KEYS */;
/*!40000 ALTER TABLE `formadepago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `capacidadMaxima` int(11) DEFAULT NULL,
  `disponibilidad` tinyint(1) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idHabitacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacionestadia`
--

DROP TABLE IF EXISTS `habitacionestadia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitacionestadia` (
  `idHabitacion` int(11) NOT NULL,
  `idEstadia` int(11) NOT NULL,
  PRIMARY KEY (`idHabitacion`,`idEstadia`),
  KEY `fk_Habitacion_has_Estadia_Estadia1_idx` (`idEstadia`),
  KEY `fk_Habitacion_has_Estadia_Habitacion1_idx` (`idHabitacion`),
  CONSTRAINT `fk_Habitacion_has_Estadia_Estadia1` FOREIGN KEY (`idEstadia`) REFERENCES `estadia` (`idEstadia`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Habitacion_has_Estadia_Habitacion1` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacionestadia`
--

LOCK TABLES `habitacionestadia` WRITE;
/*!40000 ALTER TABLE `habitacionestadia` DISABLE KEYS */;
/*!40000 ALTER TABLE `habitacionestadia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hotel` (
  `idHotel` int(11) NOT NULL AUTO_INCREMENT,
  `cuil` varchar(13) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `categoria` int(11) DEFAULT NULL,
  `checkIn` varchar(5) DEFAULT NULL,
  `chekOut` varchar(5) DEFAULT NULL,
  `idContacto` int(11) NOT NULL,
  `idDireccion` int(11) NOT NULL,
  PRIMARY KEY (`idHotel`,`cuil`,`idContacto`,`idDireccion`),
  KEY `fk_hotel_contacto1_idx` (`idContacto`),
  KEY `fk_hotel_direccion1_idx` (`idDireccion`),
  CONSTRAINT `fk_hotel_contacto1` FOREIGN KEY (`idContacto`) REFERENCES `contacto` (`idContacto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_hotel_direccion1` FOREIGN KEY (`idDireccion`) REFERENCES `direccion` (`idDireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

LOCK TABLES `hotel` WRITE;
/*!40000 ALTER TABLE `hotel` DISABLE KEYS */;
/*!40000 ALTER TABLE `hotel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itemfactura`
--

DROP TABLE IF EXISTS `itemfactura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itemfactura` (
  `idItemFactura` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precioUnitario` double DEFAULT NULL,
  PRIMARY KEY (`idItemFactura`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itemfactura`
--

LOCK TABLES `itemfactura` WRITE;
/*!40000 ALTER TABLE `itemfactura` DISABLE KEYS */;
/*!40000 ALTER TABLE `itemfactura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `idLogin` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(100) DEFAULT NULL,
  `clave` varchar(45) DEFAULT NULL,
  `idPrivilegio` int(11) NOT NULL,
  PRIMARY KEY (`idLogin`,`idPrivilegio`),
  KEY `fk_login_privilegio1_idx` (`idPrivilegio`),
  CONSTRAINT `fk_login_privilegio1` FOREIGN KEY (`idPrivilegio`) REFERENCES `privilegio` (`idPrivilegio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'Filipin','Soleado',1);
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `privilegio`
--

DROP TABLE IF EXISTS `privilegio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `privilegio` (
  `idPrivilegio` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPrivilegio`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `privilegio`
--

LOCK TABLES `privilegio` WRITE;
/*!40000 ALTER TABLE `privilegio` DISABLE KEYS */;
INSERT INTO `privilegio` VALUES (1,'administrador'),(2,'recepcionista'),(3,'encargado'),(4,'cliente');
/*!40000 ALTER TABLE `privilegio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recibo`
--

DROP TABLE IF EXISTS `recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recibo` (
  `idRecibo` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `importe` double DEFAULT NULL,
  `idFormaDePago` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  PRIMARY KEY (`idRecibo`),
  KEY `fk_recibo_formadepago1_idx` (`idFormaDePago`),
  KEY `fk_recibo_cliente1_idx` (`idCliente`),
  CONSTRAINT `fk_recibo_formadepago1` FOREIGN KEY (`idFormaDePago`) REFERENCES `formadepago` (`idFormaDePago`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_recibo_cliente1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idCliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recibo`
--

LOCK TABLES `recibo` WRITE;
/*!40000 ALTER TABLE `recibo` DISABLE KEYS */;
/*!40000 ALTER TABLE `recibo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportelimpieza`
--

DROP TABLE IF EXISTS `reportelimpieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportelimpieza` (
  `idReporteLimpieza` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `desperfeto` varchar(45) DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  PRIMARY KEY (`idReporteLimpieza`),
  KEY `fk_ReporteLimpieza_Empleado1_idx` (`legajo`),
  CONSTRAINT `fk_ReporteLimpieza_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportelimpieza`
--

LOCK TABLES `reportelimpieza` WRITE;
/*!40000 ALTER TABLE `reportelimpieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportelimpieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reportemantenimiento`
--

DROP TABLE IF EXISTS `reportemantenimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reportemantenimiento` (
  `idReporte` int(11) NOT NULL,
  `reparacion` varchar(45) DEFAULT NULL,
  `fechaOrigen` date DEFAULT NULL,
  `fechaResolucion` date DEFAULT NULL,
  `desperfecto` varchar(80) DEFAULT NULL,
  `terminado` bit(1) DEFAULT b'0',
  `legajo` int(11) NOT NULL,
  PRIMARY KEY (`idReporte`),
  KEY `fk_ReporteMantenimiento_Empleado1_idx` (`legajo`),
  CONSTRAINT `fk_ReporteMantenimiento_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reportemantenimiento`
--

LOCK TABLES `reportemantenimiento` WRITE;
/*!40000 ALTER TABLE `reportemantenimiento` DISABLE KEYS */;
/*!40000 ALTER TABLE `reportemantenimiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicio`
--

DROP TABLE IF EXISTS `servicio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servicio` (
  `idServicio` int(11) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idServicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='		';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicio`
--

LOCK TABLES `servicio` WRITE;
/*!40000 ALTER TABLE `servicio` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ticket`
--

DROP TABLE IF EXISTS `ticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ticket` (
  `idTicket` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `legajo` int(11) NOT NULL,
  `precio` double DEFAULT NULL,
  `tipoticket_idTipoTicket` int(11) NOT NULL,
  `idServicio` int(11) NOT NULL,
  PRIMARY KEY (`idTicket`,`legajo`,`tipoticket_idTipoTicket`),
  KEY `fk_Ticket_Empleado1_idx` (`legajo`),
  KEY `fk_ticket_tipoticket1_idx` (`tipoticket_idTipoTicket`),
  KEY `fk_ticket_servicio1_idx` (`idServicio`),
  CONSTRAINT `fk_Ticket_Empleado1` FOREIGN KEY (`legajo`) REFERENCES `empleado` (`legajo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ticket_servicio1` FOREIGN KEY (`idServicio`) REFERENCES `servicio` (`idServicio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ticket_tipoticket1` FOREIGN KEY (`tipoticket_idTipoTicket`) REFERENCES `tipoticket` (`idTipoTicket`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ticket`
--

LOCK TABLES `ticket` WRITE;
/*!40000 ALTER TABLE `ticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `ticket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoempleado`
--

DROP TABLE IF EXISTS `tipoempleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoempleado` (
  `idTipoEmpleado` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipoEmpleado`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoempleado`
--

LOCK TABLES `tipoempleado` WRITE;
/*!40000 ALTER TABLE `tipoempleado` DISABLE KEYS */;
INSERT INTO `tipoempleado` VALUES (1,'recepcionista');
/*!40000 ALTER TABLE `tipoempleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipohabitacion`
--

DROP TABLE IF EXISTS `tipohabitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipohabitacion` (
  `idTipoHabitacion` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idTipoHabitacion`),
  CONSTRAINT `fk_tipoHabitacion_Habitacion` FOREIGN KEY (`idTipoHabitacion`) REFERENCES `habitacion` (`idHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipohabitacion`
--

LOCK TABLES `tipohabitacion` WRITE;
/*!40000 ALTER TABLE `tipohabitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipohabitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipoticket`
--

DROP TABLE IF EXISTS `tipoticket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipoticket` (
  `idTipoTicket` int(11) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`idTipoTicket`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipoticket`
--

LOCK TABLES `tipoticket` WRITE;
/*!40000 ALTER TABLE `tipoticket` DISABLE KEYS */;
/*!40000 ALTER TABLE `tipoticket` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-06-15 11:16:52
