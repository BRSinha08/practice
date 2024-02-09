package com.practice.javaeight;

import java.util.Objects;

public class HashMapKey {
        private final int x;
        private final int y;
        private int hashCode;

        public HashMapKey(int x, int y) {
            this.x = x;
            this.y = y;
            this.hashCode = Objects.hash(x, y);
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
           return true;
        }

        @Override
        public int hashCode() {
            return 1;
        }
    }
