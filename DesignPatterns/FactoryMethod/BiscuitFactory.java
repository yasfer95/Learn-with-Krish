package com.company;

public class BiscuitFactory
{
        public Biscuit getBiscuit(String shapeType) {
            if (shapeType == null) {
                return null;
            }
            if (shapeType.equalsIgnoreCase("Square biscuit")) {
                return new SquareBiscuit();

            } else if (shapeType.equalsIgnoreCase("Circle biscuit")) {
                return new CircleBiscuit();
            }
                return null;

            }

        }